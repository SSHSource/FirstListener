package com.xuzj.listen;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * HttpSession中的对象状态
 * 绑定--解除绑定  session.setAttribute session.removeAttribute
 * 钝化--活化  
 * 将session对象实体化到一个存储设备上 -- 将session对象从存储设备上恢复
 * 钝化机制：session本来是在服务器内存中，当服务器session对象太多时候，把不经常使用的session对象
 * 暂时序列化到系统文件系统或是数据库系统中，当被使用时反序列化到内存中。整个过程由服务器自动完成。
 * 
 * session钝化管理器
 * 当tomcat服务器被关闭或重 启时，tomcat会将当前内存中的session对象钝化到服务器为文件系统中。
 * 另一种情况是web应用程序被重新加载时，内存中的session对象也会被钝化到服务器的文件系统中
 * 钝化后的文件被保存：tomcat安装路径 /work/Catalina/hostname/applicationnames/SESSION.ser
 * 
 * 
 * 
 * servlet规范
 * HttpSessionBindingListener
 * 	绑定：valueBoundfangfa
 * 	解除绑定：valueUnbound
 * 
 * HttpSessionActivationListener
 * 	钝化:sessionWillPassivate
 * 	活化：sessionDidActivate
 * @author xuzj
 *
 */
public class MyHttpSessionBindingListener implements HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub

	}

}
