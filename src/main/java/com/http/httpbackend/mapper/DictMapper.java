package com.http.httpbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.http.httpbackend.entity.Dict;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 字典表 Mapper 接口
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {

}
