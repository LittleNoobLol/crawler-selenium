package com.crawler;

public class Cookie {

	public static void main(String[] args) {
		String c = "cn_9a154edda337ag57c050_dplus=%7B%22distinct_id%22%3A%20%2215e3ec89066252-0f11471f25bc13-464c0128-1fa400-15e3ec89067229%22%2C%22sp%22%3A%20%7B%22%24_sessionid%22%3A%200%2C%22%24_sessionTime%22%3A%201504330215%2C%22%24dp%22%3A%200%2C%22%24_sessionPVTime%22%3A%201504330215%2C%22%E6%9D%A5%E6%BA%90%E6%B8%A0%E9%81%93%22%3A%20%22%22%7D%2C%22initial_view_time%22%3A%20%221504323555%22%2C%22initial_referrer%22%3A%20%22http%3A%2F%2Fwww.yidianzixun.com%2F%22%2C%22initial_referrer_domain%22%3A%20%22www.yidianzixun.com%22%7D; UM_distinctid=15e3ec89066252-0f11471f25bc13-464c0128-1fa400-15e3ec89067229; wuid=267315724915597; wuid=800477639575758; wuid_createAt=2017-09-02 13:34:40; captcha=s%3Ab139309f47f034af85c52ee99ed7ed45.xj0PvSMgK0Sz%2BrzVf9vSchzZ1vHl3HOr6BGVPaxANuo; weather_auth=2; Hm_lvt_15fafbae2b9b11d280c79eff3b840e45=1504330576; Hm_lpvt_15fafbae2b9b11d280c79eff3b840e45=1504330576";
		String cookie[]=c.split(";");
		for (String string : cookie) {
			System.out.println(string);
		}
	}
}
