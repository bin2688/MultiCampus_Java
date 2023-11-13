package com.multi.mvc02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.mvc02.BookDTO;

@Controller
public class BookController {
	//요청하나당 함수하나
	
	@Autowired
	BookDAO dao;
	
		@RequestMapping("one")
		public void one(BookDTO dto, Model model) throws Exception {
			System.out.println(dto);			
			BookDTO bag = dao.one(dto);		
			model.addAttribute("bag", bag);
			
		}
		@RequestMapping("list")
		public void list(Model model) throws Exception {
			List<BookDTO> list = dao.list();
			System.out.println(list.size());
			model.addAttribute("list", list);
		}
		
		@RequestMapping("insert")  
		public String insert(BookDTO dto) {
			System.out.println(dto);
	     	int result = dao.insert(dto);
	     	if (result == 1) {
	     		return "insert"; 
			}else {
				return "redirect:index.jsp"; 
			}
		}
		@RequestMapping("update")
		public String update(BookDTO dto) {
		 	int result = dao.update(dto);
		 	
		 	if (result == 1) {
				return "redirect:book.jsp"; 
			}else {
				return "no"; 
			}
		 	
		}
		@RequestMapping("delete")
		public void delete(BookDTO dto, Model model) {
			int result = dao.delete(dto);
			model.addAttribute("result", result);
		}
}
