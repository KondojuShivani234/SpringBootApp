package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LLMRequest;

public interface LLMRequestRepository extends JpaRepository<LLMRequest, Long> {

}

