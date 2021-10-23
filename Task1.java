package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		int[][] twoDArray = {
				{10, 20},
				{1, 2, 3},
				{100, 200, 300, 400}
				};
		int sum = 0;
		for (int i=0; i< twoDArray.length; i++) {
			for(int j= 0; j<twoDArray[i].length; j++) {
				sum+=twoDArray[i][j];	
			}	
		}
		System.out.println("Sum of all numbers = "+sum);
	}

}
