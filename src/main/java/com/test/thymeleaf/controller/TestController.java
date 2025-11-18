package com.test.thymeleaf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.thymeleaf.dto.AddressDTO;
import com.test.thymeleaf.mapper.AddressMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TestController {
	private final AddressMapper mapper;
	@GetMapping("/m1")
	public String m1(Model model) {
		int count = 100;
		String name = "아무개";
		model.addAttribute("count", count);
		model.addAttribute("name", name);
		
		//2. 객체
		AddressDTO dto = mapper.get(1);
		
		model.addAttribute("dto", dto);
		
		//3. Map
		Map<String, String> map = new HashMap<>();
		map.put("red", "빨강");
		map.put("blue", "노랑");
		map.put("yellow", "파랑");
		
		model.addAttribute("map", map);
		
		return "m1";
	}
	@GetMapping("/m2")
	public String m2(Model model) {
		return "m2";
	}
}
