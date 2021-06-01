package com.project.systemManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.systemManage.dao.api.UserDaoApi;
import com.project.systemManage.entity.base.ResponseVO;
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
@Service
public class UserServiceImpl implements UserServiceApi {

	@Autowired
	UserDaoApi userDaoApi;
	
	public ResponseVO<List<UserVO>> queryUserByPage(PageVO pageVO,UserVO userVO) {
		int count = userDaoApi.queryUserByPageCount(pageVO,userVO);
		pageVO.init(count);
		
		List<UserVO> userList=userDaoApi.queryUserByPage(pageVO,userVO);
		
		ResponseVO<List<UserVO>> responseVO=new ResponseVO<List<UserVO>>();
		responseVO.setReturnData(userList);
		return responseVO;
	}


	
	
}
