package com.codingdojo.abstractart;

import java.util.ArrayList;

public class Meseum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		// Instance 3 Paintings
		Painting painting1 = new Painting("Whaam!", "Roy Lichenstein", "Courtesy of the Tate Museum", "Acrylic and oil on canvas");
		Painting painting2 = new Painting("The Card Players", "Paul Cézanne", "None", "Oil on canvas");
		Painting painting3 = new Painting("Double Lunar Dogs", "Joan Jonas", "Courtesy of MoMa", "Undefined");
		
		// Instance 2 Sculptures
		Sculpture sculpture1 = new Sculpture("Whaam!", "Roy Lichenstein", "Courtesy of the Tate Museum", "Acrylic and oil on canvas");
		Sculpture sculpture2 = new Sculpture("The Card Players", "Paul Cézanne", "None", "Oil on canvas");
		
		painting1.viewArt();
		sculpture1.viewArt();
		
		museum.add(painting1);
		museum.add(painting2);
		museum.add(painting3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		// Ninja Bonus
		for (int i=0; i<museum.size(); i++) {
			System.out.println("Title: " + museum.get(i).getTitle() + "\n"
					+ "Author: " + museum.get(i).getAuthor() + "\n"
					+ "Decription: " + museum.get(i).getDescription() + "\n");
		}
	}

}
