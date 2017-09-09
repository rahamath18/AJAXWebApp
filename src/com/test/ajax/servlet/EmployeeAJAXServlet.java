package com.test.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeAJAXServlet extends HttpServlet {
	
	private static final long serialVersionUID = 5174974572914523504L;

	@Override
	public void init(ServletConfig config) throws ServletException {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empName = req.getParameter("empName");
		String empSalary = req.getParameter("empSalary");
		System.out.println(empName + ", " + empSalary);
		
		resp.setContentType("text/html");

		
		PrintWriter out = resp.getWriter();
		out.println(empName + ", " + empSalary);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
