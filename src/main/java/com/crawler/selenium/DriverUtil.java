package com.crawler.selenium;


import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.crawler.entity.HtmlEntity;

public class DriverUtil {

	public static HtmlEntity get(String url) throws Exception {
		PhantomJSDriver driver = null;
		HtmlEntity htmlEntity = null;
		try {
			// 设置必要参数
			DesiredCapabilities dcaps = new DesiredCapabilities();
			// ssl证书支持
			dcaps.setCapability("acceptSslCerts", true);
			// 截屏支持
			dcaps.setCapability("takesScreenshot", true);
			// css搜索支持
			dcaps.setCapability("cssSelectorsEnabled", true);
			// js支持
			dcaps.setJavascriptEnabled(true);
			// 驱动支持
			dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					"H:\\soft\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
			// 创建无界面浏览器对象
			driver = new PhantomJSDriver(dcaps);

			driver.get(url);

			Thread.sleep(5000);

			htmlEntity = new HtmlEntity(driver.getPageSource(), driver.getTitle(), driver.manage().getCookies());

		} catch (Exception e) {
			throw e;
		} finally {
			if (driver != null) {
				try {
					driver.close();
				} catch (Exception e) {
				}

				try {
					driver.quit();
				} catch (Exception e) {
				}
			}
		}

		return htmlEntity;
	}

}
