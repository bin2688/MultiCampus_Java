package com.multi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaverService {
	
	@Autowired
	NaverDAO dao;
	
	public void insert(NaverVO naverVO) {
		//db전처리, 후처리용
		//db처리 요청
		dao.insert(naverVO);
	}
}
