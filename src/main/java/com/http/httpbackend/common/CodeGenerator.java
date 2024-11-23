package com.http.httpbackend.common;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;

public class CodeGenerator {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/http";
		String username = "root";
		String password = "16940131";

		FastAutoGenerator.create(url, username, password)
				.globalConfig(builder -> builder
						.author("LiDaoyu") // 设置作者
						.enableSwagger()
						.outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
						.commentDate("yyyy-MM-dd")
						.disableOpenDir()
				)
				.packageConfig(builder -> builder
						.parent("com.http.httpbackend")
						.entity("entity")
						.mapper("mapper")
						.controller("controller")
						.service("service")
						.serviceImpl("service.impl")
						.xml("mapper.xml")
				)
				.strategyConfig(builder -> builder
						.addInclude("user", "dict") // 设置需要生成的表名

						.controllerBuilder()
						.enableFileOverride()
						.enableRestStyle()

						.entityBuilder()
						.enableFileOverride()
						.enableLombok()
						.enableTableFieldAnnotation()

						.mapperBuilder()
						.enableFileOverride()

						.serviceBuilder()
						.enableFileOverride()


				)
				.templateEngine(new FreemarkerTemplateEngine())
				.execute();
	}
}
