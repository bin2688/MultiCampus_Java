package com.multi.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
		
		@RequestMapping("test")
		public void test() {
			System.out.println("테스트요청이 들어왔음");
			//컨트롤러 다음은 스프링에서는 무조건 views/test.jsp로 넘어간다.
		}
		
		@RequestMapping("test2")
		public void test2() {
			System.out.println("테스트2 요청이 들어왔음");
		}
		
		
		
}
