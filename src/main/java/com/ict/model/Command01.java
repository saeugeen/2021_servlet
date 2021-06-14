package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01 implements Command{
	
	
	// 오늘의 날짜와 운세를 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		// 날짜와 운세 구하기 
		Calendar now = Calendar.getInstance();
	    int year = now.get(Calendar.YEAR);
	    int month = now.get(Calendar.MONTH) + 1 ;
	    int day = now.get(Calendar.DATE);
	    int lucky = (int)(Math.random()*101);
	    msg = year+"년 "+month+"월 "+day+"일  당신의 운세는 "+ lucky+ "% 입니다.";
		return msg ;
	}
}
