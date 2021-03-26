package com.springboot.restapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restapi.entity.ConvertStr;
import com.springboot.restapi.jpa.ConvertStrRepo;

@Service
public class StringOperationsService {
	
	
	@Autowired
	ConvertStrRepo convertStrRepo;

	public Integer addStr(String input) {
		try {
			
		ConvertStr str = new ConvertStr(input);			
		return convertStrRepo.save(str).getStrId();
		}catch(Exception e) {
			return 0;
		}
		
	}
	public String getStr(Integer id) {
		try {
		Optional<ConvertStr> findById = convertStrRepo.findById(id);
		return findById.get().getSubStr();
		}catch(Exception e) {
			return "";
		}
	}
	
	
}
