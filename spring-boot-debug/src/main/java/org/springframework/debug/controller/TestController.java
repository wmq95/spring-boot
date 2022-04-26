package org.springframework.debug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: fanT
 * @Date: 2022/4/15 9:44
 * @Description: test for controller
 */
@Controller
public class TestController {

	@RequestMapping("/test/hello")
	public String hello() {
		return "hello";
	}
}
