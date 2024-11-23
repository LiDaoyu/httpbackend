package com.http.httpbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.http.httpbackend.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
