package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@Autowired
	PageDAO dao;
	
	@RequestMapping("list1")
	public void list1(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		System.out.println(list.size());
		model.addAttribute("list", list);	
		}
	
	@RequestMapping("list2") //게시물 카운트 추가
	public void list2(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		System.out.println("페이지당 가지고온 게시물 개수 >>" + list.size());
		int count = dao.count(); //전체 게시물 수
		System.out.println(count);
		int pages = count/10;
		if (count%10 != 0) {
			pages += 1;
		}

		model.addAttribute("list", list);	
		model.addAttribute("pages", pages);	
		model.addAttribute("count", count);	
		}
	
	@RequestMapping("list3") //게시물 카운트 추가
	public void list3(PageVO pageVO, Model model) {
		pageVO.setStartEnd();
		List<BbsVO> list = dao.list1(pageVO);
		System.out.println("페이지당 가지고온 게시물 개수 >>" + list.size());
		int count = dao.count(); //전체 게시물 수
		System.out.println(count);
		int pages = count/10;
		if (count%10 != 0) {
			pages += 1;
		}

		model.addAttribute("list", list);	
		model.addAttribute("pages", pages);	
		model.addAttribute("count", count);	
		}

	
}
