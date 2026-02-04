package com.sagar.itemmanagement.model;

import jakarta.validation.constraints.NotBlank;

public class Item {
	
	private Long Id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	private String description;

	public Item() {
	}

	public Item(Long id, String name, String description) {
		Id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
