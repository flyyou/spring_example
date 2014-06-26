package com.multicampus.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("URI : " + uri);
		String path = uri.substring(16);
		System.out.println(path);
		HandlerMapping mappings = new HandlerMapping();
		Controller controller = mappings.getController(uri);
		String viewPage = "index.jsp";
		try {
			viewPage = controller.handleRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect(viewPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		doGet(request, response);
	}
}
