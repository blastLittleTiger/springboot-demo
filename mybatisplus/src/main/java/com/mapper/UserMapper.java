package com.mapper;

import com.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2019-05-12
 */
public interface UserMapper extends BaseMapper<User> {
	/*
	 * 自定义sql查询
	 */
	public User findOne(Integer id);
}
