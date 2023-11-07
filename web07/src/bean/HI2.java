package bean;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi2")
public class HI2 extends HttpServlet {
//서블릿이 언제 만들어지고 언제 사라지는지까지는 까지를 '생명주기'
	@Override
	public void init() throws ServletException { //처음 실행시 실행
		System.out.println("서블릿이 탄생함");
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
