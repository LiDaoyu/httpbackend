package com.http.httpbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.http.httpbackend.entity.Dict;
import com.http.httpbackend.mapper.DictMapper;
import com.http.httpbackend.service.IDictService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public List<Dict> getDict(String code) {
		LambdaQueryWrapper<Dict> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.like(Dict::getCode, code);
		return this.list(lambdaQueryWrapper);
	}
}
