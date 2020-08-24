package com.yc.web.core;

public interface ServletRequest {
	/**
	 * 解析请求方法
	 */
	public void parse();
	
	/**
	 * 获取请求参数的方法
	 */
	public String getParameter(String key);
	
	/**
	 * 获取解析出来的请求的地址
	 */
	public String getUrl();
	
	/**
	 * 请求方式
	 */
	
	public String getMethod();
	/**
	 * 获取session
	 */
	public HttpSession getSession();
	
	/**
	 * 获取Cookie
	 */
	public Cookie[] getCookies();
	
	/**
	 * 检查判断是否有JSessionId
	 */
	
	public boolean checkJSessionId();
	
	/**
	 * 获取用户的JSessionId
	 */
	public String getJSessionId();

}
