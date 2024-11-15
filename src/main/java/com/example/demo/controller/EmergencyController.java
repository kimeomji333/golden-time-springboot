package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EmergencyRequestDTO;
import com.example.demo.service.EmergencyService;

@RestController
@RequestMapping("/api/emergency/*")
public class EmergencyController {
	
	@Autowired
	private EmergencyService emergencyService; 

//	응급실 실시간 가용병상정보 조회
	@GetMapping("available-beds")
	public void getEmergencySearch(@RequestBody EmergencyRequestDTO emergencyRequest) {
		
	}
	
	

}
