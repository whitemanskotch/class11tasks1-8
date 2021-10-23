package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		int[][] twoDArray = {
				{10, 20},
				{1, 2, 3},
				{100, 200, 300, 400}
				};
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<twoDArray.length; i++) { 
			for(int j=0; j<twoDArray[i].length; j++) {
		if(twoDArray[i][j]%2==0) {
			evenSum+=twoDArray[i][j];
		}else {
			oddSum+=twoDArray[i][j];
		}
		}
			

	}
		System.out.println("Even num sum = "+evenSum);
		System.out.println("Odd num sum = "+oddSum);

	}
}
