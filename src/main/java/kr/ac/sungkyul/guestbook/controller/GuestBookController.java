package kr.ac.sungkyul.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuestBookController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list(){
		return"dddd";
	}

}
