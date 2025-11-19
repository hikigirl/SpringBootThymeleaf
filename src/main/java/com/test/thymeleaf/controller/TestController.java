package com.test.thymeleaf.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
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
	@GetMapping("/m3")
	public String m3(Model model) {
		
		int a = 10;
		int b = 3;
		//String name="홍길동";
		
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		//model.addAttribute("name", name);
		return "m3";
	}
	
	@GetMapping("/m4")
	public String m4(Model model) {

		model.addAttribute("count", 10);
		model.addAttribute("name", "아무개");
		model.addAttribute("color", "cornflowerblue");
		
		return "m4";
	}
	@GetMapping("/m5")
	public String m5(Model model) {
		
		String txt1="홍길동입니다.";
		String txt2="<b>아무개</b>입니다.";

		model.addAttribute("txt1", txt1);
		model.addAttribute("txt2", txt2);
		
		Map<String, String> map = new HashMap<>();
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("yellow", "노랑");
		
		List<String> names = mapper.names();
		List<AddressDTO> list = mapper.list();
		
		model.addAttribute("num", 10);
		model.addAttribute("name", "홍길동");
		model.addAttribute("dto", mapper.get(1));
		model.addAttribute("map", map);
		model.addAttribute("names", names);
		model.addAttribute("list", list);
		
		return "m5";
	}
	
	@GetMapping("/m6")
	public String m6(Model model) {

		int num1 = 1234567;
		double num2 = 12345.6789;
		Calendar now = Calendar.getInstance();
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("now", now);
		
		return "m6";
	}
	@GetMapping("/m7")
	public String m7(Model model) {

		int seq = 10;
		String mode = "add";
		
		model.addAttribute("seq", seq);
		model.addAttribute("mode", mode);

        Map<String, String> map = new HashMap<>();
        map.put("search", "y");
        map.put("column", "subject");
        map.put("word", "java");

        model.addAttribute("map", map);
		
		return "m7";
	}
    @GetMapping("/m8")
    public String m8(Model model) {

        int seq = 10;
        String mode = "add";

        Map<String,String> map = new HashMap<String,String>();
        map.put("search", "y");
        map.put("column", "subject");
        map.put("word", "자바");

        List<String> names = mapper.names();
        List<AddressDTO> list = mapper.list();

        model.addAttribute("seq", seq);
        model.addAttribute("mode", mode);
        model.addAttribute("map", map);
        model.addAttribute("names", names);
        model.addAttribute("list", list);

        return "m8";
    }
    @GetMapping("/m9")
    public String m9(Model model) {
        return "m9";
    }
	
}
