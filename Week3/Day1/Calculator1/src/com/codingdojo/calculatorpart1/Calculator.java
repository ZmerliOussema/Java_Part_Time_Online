package com.codingdojo.calculatorpart1;

public class Calculator {
	
	// Member Variables
	private double operandeOne;
	private double operandeTwo;
	private String operation;
	private double results;
	
	// Constructor
	public Calculator() {
		
	}
	
	// Methods
	public void performOperation() {
		if (this.operation == "+") {
			this.results = this.operandeOne + this.operandeTwo;}
		else if (this.operation == "-") {
			this.results = this.operandeOne - this.operandeTwo;}
		else {
			System.out.println("Please set the operator '+' or '-'");
		}
	}
	
	// Getters & Setters
	public double getOperandeOne() {
		return operandeOne;
	}

	public void setOperandeOne(double operandeOne) {
		this.operandeOne = operandeOne;
	}

	public double getOperandeTwo() {
		return operandeTwo;
	}

	public void setOperandeTwo(double operandeTwo) {
		this.operandeTwo = operandeTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void getResults() {
		System.out.println(results); 
	}

	public void setResults(double results) {
		this.results = results;
	}
	
	
	

}
