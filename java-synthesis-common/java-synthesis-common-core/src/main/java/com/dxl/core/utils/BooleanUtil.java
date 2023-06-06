package com.dxl.core.utils;

import java.util.Objects;

/**
* @Description:
* @Param:
* @return:
* @Author: lydms
* @Date: 2023/6/6
*/
public class BooleanUtil {

	/**
	 * 判断一个数字是否为true（等于1就是true）
	 * @param num 输入的数字
	 * @return 是否为true
	 */
	public static boolean isTrue(Integer num) {
		if (num == null) {
			return false;
		}
		return Objects.equals(num, 1);
	}

	public static boolean isFalse(Integer num) {
		return !isTrue(num);
	}

}
