package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 객체 생성 + 컨트롤러로 역할을 하는 클래스로도 설정
public class BbsController {
	
	//버튼을 눌러서 요청 --> 함수 하나
	@RequestMapping("insert2")  //다른곳에서 인식시키기위함
	public void insert2(BbsDTO2 bag, Model model) {
		System.out.println(bag);
		
		BbsDAO dao = new BbsDAO();
     	int result = dao.insert(bag);
     	//result는 views 아래까지 가지고 가야하는 속성값이야 설정
     	//'views까지 데이터를 넘길 수 있는 객체 필요(Model)'
     	//함수(Model model)써놓으면 스프링이 model객체를 만들어서 넣어준다.
     	model.addAttribute("result", result);
	}
	@RequestMapping("update2")
	public String update2(BbsDTO2 bag) {
		BbsDAO dao = new BbsDAO();
	 	int result = dao.update(bag);
	 	
	 	if (result == 1) {
			return "redirect:bbs.jsp"; //views/ok.jsp
		}else {
			return "no"; //views/no.jsp
		}
	 	
	}
	@RequestMapping("delete2")
	public void delete2(BbsDTO2 bag, Model model) {
		BbsDAO dao = new BbsDAO();
		int result = dao.delete(bag);//int
		model.addAttribute("result", result);
	}
}
