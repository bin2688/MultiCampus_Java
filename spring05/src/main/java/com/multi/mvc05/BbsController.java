package com.multi.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 객체 생성 + 컨트롤러로 역할을 하는 클래스로도 설정
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	//버튼을 눌러서 요청 --> 함수 하나
	@RequestMapping("one")
	public void one(BbsDTO2 dto, Model model) throws Exception {	
		BbsDTO2 bag = dao.one(dto);
		List<ReplyDTO> list = dao2.list(dto.getId());
		//검색결과는 bag에 들어있음
		//bag를 one.jsp까지 전달해주어야 한다. ==> Model
		model.addAttribute("bag", bag); // object(큰) <-- BbsDTO2
		//자동타입변환(자동형변환, Casting, 업캐스팅)
		model.addAttribute("list", list);
		
	}
	@RequestMapping("list")
	public void list(Model model) throws Exception {
		//dao를 이용해서 여러개를 받아서 가지고 와주세요.
		List<BbsDTO2> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("insert")  //다른곳에서 인식시키기위함
	public void insert(BbsDTO2 bag, Model model) {
		System.out.println(bag);
     	int result = dao.insert(bag);
     	//result는 views 아래까지 가지고 가야하는 속성값이야 설정
     	//'views까지 데이터를 넘길 수 있는 객체 필요(Model)'
     	//함수(Model model)써놓으면 스프링이 model객체를 만들어서 넣어준다.
     	model.addAttribute("result", result);
	}
	@RequestMapping("update")
	public String update2(BbsDTO2 bag) {
	 	int result = dao.update(bag);
	 	
	 	if (result == 1) {
			return "redirect:bbs.jsp"; //views/ok.jsp
		}else {
			return "no"; //views/no.jsp
		}
	 	
	}
	@RequestMapping("delete2")
	public void delete2(BbsDTO2 bag, Model model) {
		int result = dao.delete(bag);//int
		model.addAttribute("result", result);
	}
}
