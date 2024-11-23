package com.http.httpbackend.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRegisterDTO {
	private String name;
	private String email;
	private String age; // 假设年龄是整数
	private String hometown;
	private String currentResidence;
	private String education;
	private String frequency;
	private String ipAttitude;
	private String ipArgument;
	private List<String> platforms;
	private String onlineTime;
	private List<String> topics;
}
