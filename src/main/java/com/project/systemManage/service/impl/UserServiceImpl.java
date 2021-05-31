package com.project.systemManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.systemManage.dao.api.UserDaoApi;
import com.project.systemManage.entity.page.PageVO;
import com.project.systemManage.entity.user.UserVO;
import com.project.systemManage.service.api.UserServiceApi;
/**
 * 
 * @ClassName: UserServiceImpl  
 * @Description: TODO(用户Service实现类)  
 * @author hebinbin  
 * @date 2018年2月4日  
 *
 */
public class UserServiceImpl implements UserServiceApi {

	@Autowired
	UserDaoApi userDaoApi;
	
	public List<UserVO> queryUserByPage(PageVO pageVO,UserVO userVO) {
		List<UserVO> userList=userDaoApi.queryUserByPage(pageVO,userVO);
		return userList;
	}
	
	public int queryUserByPageCount(PageVO pageVO,UserVO userVO){
		return userDaoApi.queryUserByPageCount(pageVO, userVO);
	}

	
	
}
