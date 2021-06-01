package com.project.systemManage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.systemManage.entity.base.ResponseVO;
import com.project.systemManage.entity.page.PageVO;
import com.project.systemManage.entity.user.UserVO;
import com.project.systemManage.service.api.UserServiceApi;

/**
 * 
 * @ClassName: UserController  
 * @Description: TODO(用户controller)  
 * @author hebinbin  
 * @date 2018年2月4日  
 *
 */
@RestController
@RequestMapping(value="/user",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

	protected static Logger logger = LoggerFactory.getLogger(UserController.class); 
	
	@Autowired
	UserServiceApi userServiceApi;
	
	/**
	 * 
	 * @Title: queryUserByPage  
	 * @Description: TODO(分页查询用户)  
	 * @param @param userVO
	 * @param @param pageVO
	 * @param @return    参数  
	 * @return ResponseVO<List<UserVO>>    返回类型  
	 * @throws
	 */
	@RequestMapping("/queryUserByPage")
    public ResponseVO<List<UserVO>> queryUserByPage(UserVO userVO,PageVO pageVO){
		
		return userServiceApi.queryUserByPage(pageVO,userVO);
    }
}
