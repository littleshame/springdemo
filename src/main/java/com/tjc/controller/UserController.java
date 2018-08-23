package com.tjc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("getName")
	public String getName(){
		return "tjc";
	}

}
