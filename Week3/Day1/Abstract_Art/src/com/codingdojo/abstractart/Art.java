package com.codingdojo.abstractart;

public abstract class Art {
	
	// Member Variables
	private String title;
	private String author;
	private String description;
	
	// All Args Constructor
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	// Methods
	public abstract void viewArt();
	
	// Getters & Setters 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
