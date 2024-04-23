package com.example.demo.entity;
	
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LLM_Table")
public class LLMRequest {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String secretKey;
	    private String question;
	    private String choiceA;
	    private String choiceB;
	    private String choiceC;
	    private String choiceD;
	    private String choiceE;
	    
		public LLMRequest() {
			super();
		}
		public LLMRequest(Long id, String secretKey, String question, String choiceA, String choiceB, String choiceC,
				String choiceD, String choiceE) {
			super();
			this.id = id;
			this.secretKey = secretKey;
			this.question = question;
			this.choiceA = choiceA;
			this.choiceB = choiceB;
			this.choiceC = choiceC;
			this.choiceD = choiceD;
			this.choiceE = choiceE;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSecretKey() {
			return secretKey;
		}
		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getChoiceA() {
			return choiceA;
		}
		public void setChoiceA(String choiceA) {
			this.choiceA = choiceA;
		}
		public String getChoiceB() {
			return choiceB;
		}
		public void setChoiceB(String choiceB) {
			this.choiceB = choiceB;
		}
		public String getChoiceC() {
			return choiceC;
		}
		public void setChoiceC(String choiceC) {
			this.choiceC = choiceC;
		}
		public String getChoiceD() {
			return choiceD;
		}
		public void setChoiceD(String choiceD) {
			this.choiceD = choiceD;
		}
		public String getChoiceE() {
			return choiceE;
		}
		public void setChoiceE(String choiceE) {
			this.choiceE = choiceE;
		}
		@Override
		public String toString() {
			return "LLMRequest [id=" + id + ", secretKey=" + secretKey + ", question=" + question + ", choiceA="
					+ choiceA + ", choiceB=" + choiceB + ", choiceC=" + choiceC + ", choiceD=" + choiceD + ", choiceE="
					+ choiceE + "]";
		}
	}
