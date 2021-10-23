package com.syntax.class11;

public class Task6 {

	public static void main(String[] args) {
		// Write a program to print the first 10 numbers of Fibanacci series.
		// 0 1 1 2 3 5 8 13 21 34...
		int previusNumber=0;
		int currentNumber=1;
		int sumOfPreviusAndCurrent=0;
		int numbersToGenerate=10;
		System.out.println(previusNumber);
		System.out.println(currentNumber);
		for(int i=0; i<numbersToGenerate-2;i++) {
			sumOfPreviusAndCurrent=previusNumber+currentNumber;
			System.out.println(sumOfPreviusAndCurrent);
			previusNumber=currentNumber;
			currentNumber=sumOfPreviusAndCurrent;
		}
		

	}

}
