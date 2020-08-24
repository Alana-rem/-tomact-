package com.yc.web.core;

import java.util.Hashtable;
import java.util.Map;

public class HttpSession {
	public Map<String, Object> session = new Hashtable<String, Object>();
	private String jsessionid=null;
	
	/**
	 * 往session中存值
	 */
	public void setAttribute(String key, Object value) {
		this.session.put(key, value);
		
		//刷新服务器里面的总 session - > 一个jsessionid对应一个session对象
		
		//更新最后一次访问时间
	}
	
	/**
	 * 从session中根据键获取对应的值
	 */
	public Object getAttribute(String key) {
		if(!session.containsKey(key)) {
			return null;
		}
		
		return session.get(key);
	}
	
	public void setJSessionId(String jsession) {
		this.jsessionid=jsession;
	}

}
