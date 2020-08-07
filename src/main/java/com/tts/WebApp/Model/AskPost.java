package com.tts.WebApp.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class AskPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String message;
	
	@CreationTimestamp
	private Date createdAt;
	
	//constructors
	public AskPost() {
		
	}

	public AskPost(String message) {
		this.message = message;
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	//methods
	@Override
	public String toString() {
		return "AskPost [id=" + id + ", message=" + message + ", createdAt=" + createdAt + "]";
	}
	
	
	
	
}
