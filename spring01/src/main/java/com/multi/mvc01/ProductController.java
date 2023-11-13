package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 + 주소가 요청되었을 때 컨트롤러 역할로 설정
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	//요청하나당 함수하나!!
	@RequestMapping("insert3")
	public String insert3(ProductDTO bag, Model model) {
		
		//ProductDAO dao = new ProductDAO();
		int result = dao.insert(bag);
		
		//controller에서의 결과를 views/insert3.jsp에서 사용하고 싶을 때 
		model.addAttribute("result", result); //result = 1 or 0
		if(result == 1) {
			return "insert3"; //views아래 파일 지정할 때는 파일명만!
		}else {
			return "redirect:product.jsp"; //redirect는 클라이언트에게 요청하도록 지시!
			//redirect해서 jsp호출할 때는 파일명.jsp까지 써주어야 한다.
		}
	}
	
	@RequestMapping("update3")
	public void update3(ProductDTO bag) {
		
		//ProductDAO dao = new ProductDAO();
		int result = dao.update(bag);
	}
	
	@RequestMapping("list2")
	public void list2(Model model) throws Exception {
		//ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one2")
	public void one2(ProductDTO dto, Model model) throws Exception {
		//ProductDAO dao = new ProductDAO();
		ProductDTO one = dao.one(dto);
		model.addAttribute("one", one);
	}
}
