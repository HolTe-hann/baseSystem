package com.project.systemManage.entity.base;

import java.io.Serializable;

import com.project.systemManage.util.constant.Constant;
/**
 * 
 * @ClassName: ResponseVO  
 * @Description: TODO(service层统一返回的结果)  
 * @author hebinbin  
 * @date 2018年2月5日  
 *  
 * @param <T>
 */
public class ResponseVO<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//返回的状态码
	private String returnCode;
	
	//返回的描述信息
	private String returnDesc;
	
	//返回的数据
	private T returnData;
	
	

	public ResponseVO() {
		super();
		this.returnCode=Constant.REPS_SUCCESS;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnDesc() {
		return returnDesc;
	}

	public void setReturnDesc(String returnDesc) {
		this.returnDesc = returnDesc;
	}

	public T getReturnData() {
		return returnData;
	}

	public void setReturnData(T returnData) {
		this.returnData = returnData;
	}

	@Override
	public String toString() {
		return "ResponseVO [returnCode=" + returnCode + ", returnDesc=" + returnDesc + ", returnData=" + returnData
				+ "]";
	}
	
	

}
