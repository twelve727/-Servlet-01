package edu.kh.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpServletRequest : 클라이언트 정보 + 요청 관련 정보가 담긴 객체
//		httpServletRespones : 서버가 클라이언트에게 응답할 방법을 제공하는 객체
		
		System.out.println("이름, 나이 를 제출받아 처리할 코드 수행1");
		
//		파라미터 = 요청 시 함께 전달된 input 태그의 값인 파라미터를 얻어오는 방법
//		req.getParameter("input 태그의 name 속성 값"); = name,age
//		-> String 형태로 입력된 값 반환
//		얻어온 Parameter는 무조건 String **
		
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		
		System.out.println( inputName + " / " + inputAge );
		
//		resp.getWriter() : 서버가 클라이언트에게 응답할 수 있는 스트림을 얻어옴
//		--> PrintWriter : 출력 전용 스트림
		
//		문서 형식과 문자 인코딩 지정
		
//		-> html 문서이고, 문자는 UTF-8 형식으로 인코딩 되어있다.
//		브라우저에 해당 내용에 맞게 해석시켜준다.
		
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print(inputName + "님의 나이는" + inputAge + "세 입니다.");
		
		
		
		
	}
}
