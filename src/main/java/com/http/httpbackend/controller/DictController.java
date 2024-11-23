package com.http.httpbackend.controller;

import com.http.httpbackend.common.Result;
import com.http.httpbackend.entity.Dict;
import com.http.httpbackend.service.impl.DictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 字典表 前端控制器
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@RestController
@RequestMapping("/dict")
public class DictController {
	@Autowired
	DictServiceImpl dictService;

	@GetMapping("/get")
	public Result getDict(@RequestParam String code) {
		List<Dict> list = dictService.getDict(code);
		return new Result(HttpStatus.OK.value(), "success", list);
	}
}
