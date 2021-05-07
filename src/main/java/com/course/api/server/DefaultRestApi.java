package com.course.api.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestApi {
	
	@RequestMapping(value = "/api/welcome")
	public String welcome() {
		return "welcome chandan" +" kumar jena";
	}

}
