package com.multi.mvc05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@Autowired
	MapDAO mapDAO;
	
	@Autowired
	ChartDAO chartDAO;
	
	@RequestMapping("string")
	@ResponseBody //controller에서 data를 리턴할 때! ==> views를 만들필요가 없음.
	public String name() {
		return "winner";
		
	}
	
	@RequestMapping("json1")
	@ResponseBody
	public BbsDTO2 json1() {
		BbsDTO2 dto = new BbsDTO2();
		dto.setId(1);
		dto.setTitle("win");
		dto.setContent("win!!win!!");
		dto.setWriter("apple");
		return dto;
	}
	@RequestMapping("json2")
	@ResponseBody // list => array[{json},{},{}...]
	public ArrayList<BbsDTO2> json2() {
		ArrayList<BbsDTO2> list = new ArrayList<BbsDTO2>();
		for (int i = 0; i < 5; i++) {
			BbsDTO2 dto = new BbsDTO2();
			dto.setId(i);
			dto.setTitle("win" + i);
			dto.setContent("win!!win!!" + i);
			dto.setWriter("apple");
			list.add(dto);		
		}
		return list;
	}
	
	@RequestMapping("map1")
	@ResponseBody
	public MapVO kakaoMap() {
		MapVO map = new MapVO();
		map.setLat(37.5072856);
		map.setLon(126.7117297);
		return map;
	}
	
	@RequestMapping("map2")
	@ResponseBody
	public MapVO one(String location) {
		return mapDAO.one(location);

	}
	
	@RequestMapping("map3")
	@ResponseBody
	public List<MapVO> all() {
		return mapDAO.all();

	}
	
	@RequestMapping("chart1")
	@ResponseBody
	public List<ChartDTO> chart() {
		return chartDAO.all();

	}
}