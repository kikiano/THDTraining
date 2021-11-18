package com.sample.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.models.Guide;
import com.sample.demo.service.GuideService;

@RestController
public class GuideController {
	
	private GuideService service;

	public GuideController(GuideService service) {
		this.service = service;
	}
	
	@GetMapping("/showAll")
	public List<Guide> showAll(){
		return service.allGuides();
	}
	
	
}
