package com.crawler.entity;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class HtmlEntity {

	public HtmlEntity() {
	}

	public HtmlEntity(String html, String title, Set<Cookie> cookies) {
		this.html = html;
		this.title = title;
		this.cookies = cookies;
	}

	private String html;
	private String title;
	private Set<Cookie> cookies;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Cookie> getCookies() {
		return cookies;
	}

	public void setCookies(Set<Cookie> cookies) {
		this.cookies = cookies;
	}

}
