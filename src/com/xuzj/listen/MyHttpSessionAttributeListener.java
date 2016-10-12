package com.xuzj.listen;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * request.setAttribute("","");放在request域对象的一个属性
 * @author xuzj
 *
 */
public class MyHttpSessionAttributeListener implements
		HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub

		System.out.println("attributeAdded"+httpSessionBindingEvent.getName());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		System.out.println("attributeRemoved"+httpSessionBindingEvent.getName());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		System.out.println("attributeReplaced"+httpSessionBindingEvent.getName());
	}

}
