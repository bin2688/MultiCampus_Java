package bean;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hi2")
public class HI2 extends HttpServlet {
//서블릿이 언제 만들어지고 언제 사라지는지까지는 까지를 '생명주기'
	@Override
	public void init(ServletConfig config) throws ServletException { //처음 실행시 실행
		System.out.println("서블릿이 탄생함");
		String tel = config.getInitParameter("tel");
		String email = config.getInitParameter("email");
		//관리자한테 문자를 보내줘 처리
		System.out.println("관리자 전화번호" + tel + "로 문자보냄");
		System.out.println("관리자 이메일" + email + "로 메일보냄");
	}
	
	@Override
	public void destroy() { //끄거나 수정시 실행
		System.out.println("서블릿 생명을 다함.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()메서드가 자동호출됨");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
