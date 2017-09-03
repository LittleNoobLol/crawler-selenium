package com.crawler.util;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class CookieUtil {

	/***
	 * 
	 * @Description Cookie 转化为文本
	 * @author lixin
	 * @date 2017年9月2日
	 * @param cookies
	 * @return cookie字符串
	 */
	public static String convertCookie(Set<Cookie> cookies) {
		StringBuffer sb = new StringBuffer();
		for (Cookie cookie : cookies) {
			sb.append(cookie.getName() + "=" + cookie.getValue() + ";");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
}
