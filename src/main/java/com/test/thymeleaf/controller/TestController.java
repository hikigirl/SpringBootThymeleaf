package com.test.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		return "m1";
	}
}
