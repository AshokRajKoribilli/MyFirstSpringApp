package com.learn.springboot.myfirstspringapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! How are you doing?";
	}
	
//	@RequestMapping("say-hello-HTML")
//	@ResponseBody
//	public String sayHelloHtml() {
//		return "Hello! How are you doing?";
//	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
