package com.http.httpbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.http.httpbackend.entity.Dict;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
public interface IDictService extends IService<Dict> {

	List<Dict> getDict(String code);
}
