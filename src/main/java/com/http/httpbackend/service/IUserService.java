package com.http.httpbackend.service;

import com.http.httpbackend.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
public interface IUserService extends IService<User> {

	Boolean register(User user);
}
