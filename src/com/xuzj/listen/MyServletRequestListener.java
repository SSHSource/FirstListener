package com.xuzj.listen;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("requestDestroyed");

	}

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		// TODO Auto-generated method stub
		servletRequestEvent.getServletRequest().getParameter("name");//获取请求参数
		System.out.println("requestInitialized");
	}

}
