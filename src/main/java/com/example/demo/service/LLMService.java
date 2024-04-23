package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LLMRequest;

@Service
public interface LLMService {

	ResponseEntity<String> saveProduct(LLMRequest llmRequest);

}
