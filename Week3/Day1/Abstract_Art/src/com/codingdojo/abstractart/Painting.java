package com.codingdojo.abstractart;

public class Painting extends Art {
	
	// Member Variables 
	private String paintType;
	
	// Constructor
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	@Override
	public void viewArt() {
		System.out.println("Title: " + this.getTitle() + "\n"
							+ "Author: " + this.getAuthor() + "\n"
							+ "Description " + this.getDescription() + "\n"
							+ "Paint Type: " + this.paintType + "\n"
				);

	}
	
	// Getters & Setters
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	
	
	

}
