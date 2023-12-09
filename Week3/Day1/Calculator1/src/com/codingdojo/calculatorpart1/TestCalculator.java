package com.codingdojo.calculatorpart1;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.setOperandeOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandeTwo(5.2);
		calculator.performOperation();
		calculator.getResults();
	}

}
