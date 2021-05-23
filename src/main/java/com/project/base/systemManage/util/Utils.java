package com.project.base.systemManage.util;

import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class Utils {
	
	static String  version="1.0";
	
	/**
	 * 生成一个UUID，去掉了"-"
	 * @return
	 */
	public static String randomUUID() {
		UUID uuid = UUID.randomUUID(); 
		return uuid.toString().replaceAll("-", "");
	}
	
	
	/**
	 * 将HttpServletRequest中的参数转化到对应的javaBean
	 * @param request
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T requestToBean(HttpServletRequest request , Class<T> clazz)
    {
        //创建javaBean对象    
        Object obj=null;
        try {
            obj=clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //4.注册一个日期格式转换器
        ConvertUtils.register(new DateLocaleConverter(), java.util.Date.class);
        //得到请求中的每个参数
        Enumeration<String> enu = request.getParameterNames();
        while(enu.hasMoreElements())
        {
            //获得参数名
            String name = enu.nextElement();
            //获得参数值
            String value = request.getParameter(name);
            //然后把参数拷贝到javaBean对象中
            try {
                BeanUtils.setProperty(obj, name, value);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return (T)obj;
    }
	
	
	
	
	
}
