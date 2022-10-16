package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
 @GetMapping("/welcome")
	public String welcome() {
	 return "Welcome to Diksha Demo hosted by Hitachi India PVT LTD 1234--amit naudiyal";
 }
}
