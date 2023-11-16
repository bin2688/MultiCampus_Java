package com.multi.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO replyDAO;
	
	@RequestMapping("insert4") //ajax호출!
	public void insert(ReplyDTO replyDTO, Model model) {
		System.out.println(replyDTO);
		int result = replyDAO.insert(replyDTO);
		model.addAttribute("result", result);
		//스프링은 자동으로 클래스이름 앞글자를 소문자로 변수로 만들어두면 views까지 모델속성으로 지정하여 전달해준다.
		// model.addAttribute("replyDTO", replyDTO); 스프링은 기본적으로 제공해줌
		}
}
