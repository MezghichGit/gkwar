package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DevopsWarApplication extends SpringBootServletInitializer {
	
	@ResponseBody
	@RequestMapping("/home")
	public String info()
	{
		return"<h1 align=center> Merci GK, Devops c'est Top, Maintenant voyons Docker</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsWarApplication.class, args);
	}

}
