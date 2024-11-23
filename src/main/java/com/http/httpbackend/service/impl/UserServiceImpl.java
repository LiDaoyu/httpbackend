package com.http.httpbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.http.httpbackend.DTO.UserRegisterDTO;
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
	public Boolean register(UserRegisterDTO userRegisterDTO) {
		User user = new User();
		user.setName(userRegisterDTO.getName());
		user.setEmail(userRegisterDTO.getEmail());
		user.setAge(Integer.valueOf(userRegisterDTO.getAge() == null ? "0" : userRegisterDTO.getAge()));
		user.setHometown(DictCode.code2int(userRegisterDTO.getHometown()));
		user.setCurrentResidence(DictCode.code2int(userRegisterDTO.getCurrentResidence()));
		user.setEducation(DictCode.code2int(userRegisterDTO.getEducation()));
		user.setFrequency(DictCode.code2int(userRegisterDTO.getFrequency()));
		user.setIpAttitude(DictCode.code2int(userRegisterDTO.getIpAttitude()));
		user.setIpArgument(DictCode.code2int(userRegisterDTO.getIpArgument()));
		user.setPlatform(DictCode.code2int(userRegisterDTO.getPlatforms()));
		user.setOnlineTime(DictCode.code2int(userRegisterDTO.getOnlineTime()));
		user.setTopic(DictCode.code2int(userRegisterDTO.getTopics()));
		return this.save(user);
	}
}
