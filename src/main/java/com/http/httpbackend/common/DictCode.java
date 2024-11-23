package com.http.httpbackend.common;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DictCode {

	// 取出code的数字编码
	public static int code2int(String code) {
		if (Objects.equals(code, "")) {
			return 1;
		}
		String[] codeSplit = code.split("\\.");
		return Integer.parseInt(codeSplit[codeSplit.length - 1]);
	}

	public static String code2int(List<String> codeList) {
		int[] codeIntArrays = new int[codeList.size()];
		for (String code : codeList) {
			codeIntArrays[codeList.indexOf(code)] = code2int(code);
		}
		return Arrays.toString(codeIntArrays);
	}
}
