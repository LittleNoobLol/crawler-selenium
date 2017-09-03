package com.crawler;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.crawler.entity.HtmlEntity;
import com.crawler.selenium.DriverUtil;

public class Tss {

	public static void main(String[] args) throws Exception {
		HtmlEntity htmlEntity = DriverUtil.get("http://blog.csdn.net/qq_29109907/article/details/52045685");
		
		System.out.println(htmlEntity.getHtml());
	}
	
	//
	//
	
	/**
	 * Hm_lpvt_15fafbae2b9b11d280c79eff3b840e45:1504332776
captcha:s%3Afbc67220b4826bf8ab468fd65ec2e51d.cMriXhimIeKpBRnA5XL2nEqq20xHmjB2J0KVoGx58Yw
CNZZDATA1255169715:1688299629-1504332024-%7C1504332024
wuid_createAt:2017-09-02 14:12:55
Hm_lvt_15fafbae2b9b11d280c79eff3b840e45:1504332776
UM_distinctid:15e413881e09c-05bdaa36b-36675459-1fa400-15e413881e18d
cn_9a154edda337ag57c050_dplus:%7B%22distinct_id%22%3A%20%2215e413881e09c-05bdaa36b-36675459-1fa400-15e413881e18d%22%7D
wuid:251890337560325
wuid:183182479115203
	 */
}
