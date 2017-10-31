package com.test.Jetty;

import org.eclipse.jetty.server.Server;

import com.test.Jetty.handler.HelloHandler;

public class JettyDemo {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		//ContextHandler context = new ContextHandler();
		//context.setContextPath("/");
		//context.setResourceBase(".");
		//context.setClassLoader(Thread.currentThread().getContextClassLoader());
		server.setHandler(new HelloHandler());
		//context.setHandler(new HelloHandler());
		server.start();
		server.join();
	}

}
