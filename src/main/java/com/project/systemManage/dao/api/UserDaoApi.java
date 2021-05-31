package com.project.systemManage.dao.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.project.systemManage.entity.page.PageVO;
import com.project.systemManage.entity.user.UserVO;
/**
 * 
 * @ClassName: UserDaoApi  
 * @Description: TODO(用户Dao接口)  
 * @author hebinbin  
 * @date 2018年2月4日  
 *
 */
public interface UserDaoApi {

	/**
	 * @Title: queryUserByPage  
	 * @Description: TODO(分页查询用户)  
	 * @param @return    参数  
	 * @return List<UserVO>    返回类型  
	 * @throws
	 */
	List<UserVO> queryUserByPage(@Param("pageVO")PageVO pageVO,@Param("userVO")UserVO userVO);
	/**
	 * 
	 * @Title: queryUserByPageCount  
	 * @Description: TODO(分页查询用户的记录数)  
	 * @param @param pageVO
	 * @param @param userVO
	 * @param @return    参数  
	 * @return int    返回类型  
	 * @throws
	 */
	int queryUserByPageCount(@Param("pageVO")PageVO pageVO,@Param("userVO")UserVO userVO);
}
