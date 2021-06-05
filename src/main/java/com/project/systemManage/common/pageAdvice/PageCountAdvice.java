package com.project.systemManage.common.pageAdvice;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.alibaba.fastjson.JSON;
import com.project.systemManage.common.application.ApplicationContextProvider;

@Aspect
@Component
public class PageCountAdvice {
	
	@Pointcut("execution(* com.project.systemManage.dao.api..*.*ByPage_nothing(..))")
	public void executeService(){}
	
	@Before("executeService()")  
	public void doBeforeAdvice(JoinPoint joinPoint){  
		//获取目标方法的参数信息  
	    Object[] obj = joinPoint.getArgs(); 
	    if(obj.length > 0) {
	    	for(int i=0;i<obj.length;i++){
	    		System.out.println("请求的参数信息为："+obj[i]);
	    	} 
	    } 
	    
	    
	    //AOP代理类的信息  
	    System.out.println(joinPoint.getThis().toString());  
	    //代理的目标对象  
	    System.out.println(joinPoint.getTarget().getClass().getName());  
	    //用的最多 通知的签名  
	    Signature signature = joinPoint.getSignature(); 
	    
	    String funCount=signature.getName()+"Count";
	    
	    String proxyClassName=signature.getDeclaringTypeName();
	    
	    
	    //代理的是哪一个方法  
	    System.out.println(signature.getName());  
	    //AOP代理类的名字  
	    System.out.println(signature.getDeclaringTypeName());  
	    //AOP代理类的类（class）信息  
	    Class proxyClass=signature.getDeclaringType();  

	    ApplicationContextProvider.getApplicationContext().getBean(proxyClass);
	    
	    
	    
	    
	    
	    //获取RequestAttributes  
	    RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();  
	    //从获取RequestAttributes中获取HttpServletRequest的信息  
	    HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);  
	    //如果要获取Session信息的话，可以这样写：  
	    //HttpSession session = (HttpSession) requestAttributes.resolveReference(RequestAttributes.REFERENCE_SESSION);  
	    Enumeration<String> enumeration = request.getParameterNames();  
	    Map<String,String> parameterMap = new HashMap<String,String>();  
	    while (enumeration.hasMoreElements()){  
	        String parameter = enumeration.nextElement();  
	        parameterMap.put(parameter,request.getParameter(parameter));  
	    }  
	    String str = JSON.toJSONString(parameterMap);  
	    if(obj.length > 0) {  
	        System.out.println("请求的参数信息为："+str);  
	    }  
	}
}
