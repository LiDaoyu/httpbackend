package com.http.httpbackend.common;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class DictCode {

	// 取出code的数字编码
	public static int code2int(String code) {
		String[] codeSplit = code.split("\\.");
		return Integer.parseInt(codeSplit[codeSplit.length - 1]);
	}

	// 处理dict.code字段
	public static void set(Supplier<Object> getter, Consumer<Integer> setter) {
		String dictCode = getter.get().toString();
		int id = code2int(dictCode);
		setter.accept(id);
	}
}
