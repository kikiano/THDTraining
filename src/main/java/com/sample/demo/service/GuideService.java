package com.sample.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.cloud.spanner.Key;
import com.sample.demo.data.GuideRepository;
import com.sample.demo.models.Guide;

@Service
public class GuideService {
	private GuideRepository repo;

	public GuideService(GuideRepository repo) {
		this.repo = repo;
	}
	
	public Guide saveGuide(Guide guide) {
		return repo.save(guide);
	}
	
	public List<Guide> allGuides(){
		return (List<Guide>)repo.findAll();	
	}
	
	public void deleteGuide(Key id) {
		repo.deleteById(id);
	}
}
