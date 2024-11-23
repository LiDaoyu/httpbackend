package com.http.httpbackend.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class Result {
	private int code;
	private String msg;
	private Object data;

	public Result(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static Result success() {
		return new Result(HttpStatus.OK.value(), "success", null);
	}

	public static Result error() {
		return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(), "failed", null);
	}
}
