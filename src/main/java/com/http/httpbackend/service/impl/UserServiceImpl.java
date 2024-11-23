package com.http.httpbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.http.httpbackend.common.DictCode;
import com.http.httpbackend.entity.User;
import com.http.httpbackend.mapper.UserMapper;
import com.http.httpbackend.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public Boolean register(User user) {
		DictCode.set(user::getHometown, user::setHometown);
		DictCode.set(user::getCurrentResidence, user::setCurrentResidence);
		DictCode.set(user::getEducation, user::setEducation);
		DictCode.set(user::getFrequency, user::setFrequency);
		DictCode.set(user::getIpAttitude, user::setIpAttitude);
		DictCode.set(user::getIpArgument, user::setIpArgument);
		DictCode.set(user::getPlatform, user::setPlatform);
		DictCode.set(user::getOnlineTime, user::setOnlineTime);
		DictCode.set(user::getTopic, user::setTopic);
		return this.save(user);
	}
}
