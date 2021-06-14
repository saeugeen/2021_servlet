package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08")
public class Ex08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int sum = kor + eng + math ;
		double avg = (int)(sum/3.0*10)/10.0;
		String hak = "";
		if(avg>=90) {
			hak = "A 학점";
		}else if(avg>=80) {
			hak = "B 학점";
		}else if(avg>=70) {
			hak = "C 학점";
		}else {
			hak = "F 학점";
		}
		
		out.println("<h2> 성적보기 </h2>");
		out.print("<h3><ul>");
		out.println("<li>이름 : " + name + "</li>");
		out.println("<li>총점 : " + sum + "</li>");
		out.println("<li>평균 : " + avg + "</li>");
		out.println("<li>학점 : " + hak + "</li>");
		out.print("</ul></h3>");
				
	}
}








