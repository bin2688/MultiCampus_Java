package com.multi.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {
	
	@Autowired
	DictionaryService service;

	@RequestMapping("emotion")
	public void one(String sentence, Model model) {
		//문장에 들어있는 명사만을 추출 -> dao에게 명사 넘기기 -> jumsu 몽고DB에서 검색 -> 가지고오기
		//=> DB에 넣기 전처리, DB에서 검색한 후처리
		//컨트롤러 -> 문장에 들어있는 명사만을 추출(service가 처리) -> dao
		service.emotion(sentence);
	}
}
