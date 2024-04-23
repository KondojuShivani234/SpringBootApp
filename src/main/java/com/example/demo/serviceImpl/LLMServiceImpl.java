package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.dao.LLMRequestRepository;
import com.example.demo.entity.LLMRequest;
import com.example.demo.service.LLMService;

public class LLMServiceImpl implements LLMService{

	@Autowired
	private LLMRequestRepository llmRequestRepository;

	@Override
	public ResponseEntity<String> saveProduct(LLMRequest llmRequest) {

		if (!isValidRequest(llmRequest)) {
			return ResponseEntity.badRequest().body("Invalid LLM request.");

		}
		llmRequestRepository.save(llmRequest);

		return ResponseEntity.status(HttpStatus.CREATED).body("LLM Request submitted successfully");

	}

	private boolean isValidRequest(LLMRequest llmRequest) {
		// Implement your validation logic here
		// For example, check if the question and at least one choice are provided
		return llmRequest != null &&
				llmRequest.getQuestion() != null &&
				!llmRequest.getQuestion().trim().isEmpty() &&
				(llmRequest.getChoiceA() != null || llmRequest.getChoiceB() != null ||
				llmRequest.getChoiceC() != null || llmRequest.getChoiceD() != null ||
				llmRequest.getChoiceE() != null);

	}

}
