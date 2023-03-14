package com.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AjaxViewController {
	
	//1. index페이지에서 get 요청
	@GetMapping("/ajax-ex-01")
	public String ajaxEx01() {
		return "ajax-ex-01";
	}
	//2. index페이지에서 post 요청
	@GetMapping("/ajax-ex-02")
	public String ajaxEx02() {
		return "ajax-ex-02";
	}
	//3. index페이지에서 get 요청
	@GetMapping("/ajax-ex-03")
	public String ajaxEx03() {
		return "ajax-ex-03";
	}
	//04. _post & parameter 전달하기
	@GetMapping("/ajax-ex-04")
	public String ajaxEx04() {
		return "ajax-ex-04";
	}
	//05. _get & parameter DTO로 받기 (@ModelAttribute) & DTO 객체 리턴하기
	@GetMapping("/ajax-ex-05")
	public String ajaxEx05() {
		return "ajax-ex-05";
	}
	//06. _post & parameter DTO로 받기 (@ModelAttribute) & DTO 객체 리턴하기
	@GetMapping("/ajax-ex-06")
	public String ajaxEx06() {
		return "ajax-ex-06";
	}
	//07. _post 요청시 & parameter DTO로 받기 (@RequestBody) & DTO 객체 리턴하기
	@GetMapping("/ajax-ex-07")
	public String ajaxEx07() {
		return "ajax-ex-07";
	}
	//08. _post 요청시 & parameter 전달하기 & List 객체로 리턴하기
	@GetMapping("/ajax-ex-08")
	public String ajaxEx08() {
		return "ajax-ex-08";
	}
	//09. _post 요청시 & parameter 전달하기 & ResponseEntity에 DTO 객체 리턴
	@GetMapping("/ajax-ex-09")
	public String ajaxEx09() {
		return "ajax-ex-09";
	}
	//10. _post 요청시 & parameter 전달하기 & ResponseEntity에 List 객체 리턴
	@GetMapping("/ajax-ex-10")
	public String ajaxEx10() {
		return "ajax-ex-10";
	}
	
	
	// <실습> get매핑으로 view페이지 이동
	@GetMapping("/ajax-lab")
	public String ajax_lab() {
		return "ajax_lab";
	}
	
}
