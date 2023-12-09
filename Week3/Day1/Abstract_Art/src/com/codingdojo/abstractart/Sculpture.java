package com.codingdojo.abstractart;

public class Sculpture extends Art {
	
	// Member Variables
	private String material;
	
	// Constructor
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	public void viewArt() {
		System.out.println("Title: " + this.getTitle() + "\n"
				+ "Author: " + this.getAuthor() + "\n"
				+ "Description " + this.getDescription() + "\n"
				+ "Material: " + this.material + "\n"
	);

	}

	// Getters & Setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
