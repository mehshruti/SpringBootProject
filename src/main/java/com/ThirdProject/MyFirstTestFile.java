package com.ThirdProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstTestFile {
	@RequestMapping("/test")
	public List<cofig> getlist() {
		return Arrays.asList(
				new cofig("shruti","c++",898),
				new cofig("surbhi","python",877));
	}
	
	

}
