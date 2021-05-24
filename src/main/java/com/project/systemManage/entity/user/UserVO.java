package com.project.systemManage.entity.user;

import java.util.Date;

import com.project.systemManage.entity.base.BaseVO;
/**
 * 
 * @ClassName: UserVO  
 * @Description: TODO(用户实体类)  
 * @author hebinbin  
 * @date 2018年1月28日  
 *
 */
public class UserVO extends BaseVO{
	
	private static final long serialVersionUID = 1L;
	
	//用户名称(登录名称)
	private String name;
		
	//用户姓名
	private String trueName;
	
	//用户密码
	private String password;
	
	// 最后登录时间
	private Date loginDateTime;
	
	//排序
	private Integer sort;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLoginDateTime() {
		return loginDateTime;
	}

	public void setLoginDateTime(Date loginDateTime) {
		this.loginDateTime = loginDateTime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	
	
	
}
