package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 implements Command{
	// 계산기 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
        // 계산 결과 구하기  
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2 = Integer.parseInt(request.getParameter("s2"));
		String op = request.getParameter("op");
		int result = 0 ;
		switch (op) {
		case "+": result = s1 + s2 ;break;
		case "-": result = s1 - s2 ;break;
		case "*": result = s1 * s2 ;break;
		case "/": result = s1 / s2 ;break;
		}
		msg = s1 + op + s2 + "=" + result ;
		return msg ;
	}
}
