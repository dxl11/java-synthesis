package com.dxl.javasynthesisuser.mapper;

import com.dxl.javasynthesisuser.model.User;
import com.dxl.javasynthesisuser.vo.UserApiVO;
import com.dxl.javasynthesisuser.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表
 *
 * @author YXF
 * @date 2020-12-08 11:18:04
 */
public interface UserMapper {

	/**
	 * 获取用户表列表
	 *
	 * @return 用户表列表
	 */
	List<UserVO> list();

	/**
	 * 根据用户表id获取用户表
	 *
	 * @param userId 用户表id
	 * @return 用户表
	 */
	UserApiVO getByUserId(@Param("userId") Long userId);

	/**
	 * 保存用户表
	 *
	 * @param user 用户表
	 */
	void save(@Param("user") User user);

	/**
	 * 更新用户表
	 *
	 * @param user 用户表
	 */
	void update(@Param("user") User user);

	/**
	 * 根据用户id列表，获取用户信息
	 *
	 * @param userIds
	 * @return
	 */
	List<UserApiVO> getUserByUserIds(@Param("userIds") List<Long> userIds);

	/**
	 * 根据用户id获取用户详细信息
	 * @param userId 用户id
	 * @return 用户详细信息
	 */
	UserApiVO getUserAndOpenIdsByUserId(@Param("userId") Long userId);
}
