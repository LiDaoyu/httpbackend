package com.http.httpbackend.controller;

import com.http.httpbackend.common.Result;
import com.http.httpbackend.entity.User;
import com.http.httpbackend.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;

	@PostMapping("/register")
	public Result register(@RequestBody User user) {
		if (userService.register(user)) {
			return new Result(HttpStatus.OK.value(), "success", null);
		} else {
			return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(), "failed", null);
		}
	}
}
