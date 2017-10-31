package com.test.Jetty.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloHandler extends AbstractHandler {

	@Override
	public void handle(String arg0, Request baseRequest, HttpServletRequest httpRequest, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		baseRequest.setHandled(true);
		response.getWriter().print("Hello World");
		response.setStatus(HttpServletResponse.SC_OK);
		System.out.println();
	}

}
