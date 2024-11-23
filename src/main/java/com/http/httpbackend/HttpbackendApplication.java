package com.http.httpbackend;

import cn.hutool.core.lang.Console;
import com.http.httpbackend.common.IpAddressUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HttpbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpbackendApplication.class, args);
	}

	/**
	 * 项目启动输出访问地址
	 */
	@Bean
	public ApplicationRunner applicationRunner(WebServerApplicationContext context) {
		return (ApplicationArguments args) -> {
			try {
				Console.log("===============项目启动成功 start===============");
				List<String> ipAddressList = IpAddressUtils.getIpAddressOfStartUp(context);
				ipAddressList.forEach(Console::log);
				Console.log("================项目启动成功 end================");
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}
