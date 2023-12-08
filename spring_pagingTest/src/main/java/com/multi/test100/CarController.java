package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
		
		@Autowired
		CarDAO dao;
		
		@RequestMapping("list4")
		public void list4(PageVO2 pageVO2, Model model) {
			pageVO2.setStartEnd();
			List<CarVO> list = dao.list1(pageVO2);
			System.out.println("가져온 리스트 개수>>" + list.size());
			int count = dao.count();
			int pages = count/5;
			if (count%5 != 0) {
				pages += 1;
			}
			model.addAttribute("list", list);
			model.addAttribute("count", count);
			model.addAttribute("pages", pages);		
		}
		
		@RequestMapping("list5")
		public void list5(PageVO2 pageVO2, Model model) {
			pageVO2.setStartEnd();
			List<CarVO> list = dao.list1(pageVO2);
			System.out.println("가져온 리스트 개수>>" + list.size());
			int count = dao.count();
			int pages = count/5;
			if (count%5 != 0) {
				pages += 1;
			}
			model.addAttribute("list", list);
			model.addAttribute("count", count);
			model.addAttribute("pages", pages);		
		}
		
		@RequestMapping("list0")
		public void list0(PageVO2 pageVO2, Model model) {
			pageVO2.setStartEnd();
			List<CarVO> list = dao.list1(pageVO2);
			System.out.println(list.size());
			model.addAttribute("list", list);	
			}
		
}
