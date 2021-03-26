package com.springboot.restapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.service.StringOperationsService;
import com.springboot.restapi.util.CommonUtil;

@RestController
 
public class StringServiceController {
	
	
	@Autowired
	StringOperationsService stringOperationsService;
	
	@GetMapping("/RestService/getSubstring")
	public String getSubString(@RequestParam String input) {
		String subString = CommonUtil.findTheLongestPath(input);
		Integer strId = stringOperationsService.addStr(subString);
		return stringOperationsService.getStr(strId);
	}

}
