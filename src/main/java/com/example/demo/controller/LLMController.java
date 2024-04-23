package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LLMRequest;
import com.example.demo.service.LLMService;

@RestController
@RequestMapping("/api/llm")
public class LLMController {
	
	@Autowired
	private LLMService llmService;
   
    @PostMapping("/submit")
    public ResponseEntity<String> submitLLMRequest(@RequestBody LLMRequest llmRequest) {
    	
            return llmService.saveProduct(llmRequest);
        }

}
