package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	@GetMapping("/docker")
	public String docker() {
		return "hello docker";
	}
	
	@GetMapping("/kubernetes")
	public String kubernetes() {
		return "hello kubernetes";
	}
	
	@GetMapping("/gcp")
	public String gcp() {
		return "hello GCP";
	}



}
