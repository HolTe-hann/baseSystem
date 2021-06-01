package com.project.systemManage.service.api;

import java.util.List;

import com.project.systemManage.entity.base.ResponseVO;
import com.project.systemManage.entity.page.PageVO;
import com.project.systemManage.entity.user.UserVO;
/**
 * 
 * @ClassName: UserServiceApi  
 * @Description: TODO(用户Service接口)  
 * @author hebinbin  
 * @date 2018年2月4日  
 *
 */
public interface UserServiceApi {

	/**
	 * @Title: queryUserByPage  
	 * @Description: TODO(分页查询用户)  
	 * @param @return    参数  
	 * @return List<UserVO>    返回类型  
	 * @throws
	 */
	ResponseVO<List<UserVO>> queryUserByPage(PageVO pageVO,UserVO userVO);
	
}
