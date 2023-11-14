package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
		
	@Autowired
	SqlSessionTemplate my;
	
		public int insert(BookDTO dto) {
			int result = my.insert("book.create",dto);
			return result;
		}
		
		public int update(BookDTO dto) {
			int result = my.update("book.update",dto);
			return result;
		}
		
		public int delete(BookDTO dto) {
			int result = my.update("book.delete",dto);
			return result;
		}
		
		public List<BookDTO> list() {
			List<BookDTO> list = my.selectList("book.list");
			return list;
		}
		
		public BookDTO one(BookDTO dto) {
			BookDTO bag2 = my.selectOne("book.one", dto);
			return bag2;
		}
		
}
