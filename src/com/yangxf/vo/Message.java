package com.yangxf.vo;

import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class Message {

	private String welcome;
	private List<String> usernames;
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setContent(String name,String msg) {
		this.content = name + "在" + new Date() + "时刻" + "说了：" + msg;
	}
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	public List<String> getUsernames() {
		return usernames;
	}
	public void setUsernames(List<String> usernames) {
		this.usernames = usernames;
	}
	
	public String toJson() {
		return gson.toJson(this);
	}
	
	private static Gson gson = new Gson();
}
