package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		int[][] twoDArray = {
				{10, 20},
				{1, 2, 3},
				{100, 200, 300, 400}
				};
		int odd, even;
		
		for(int i=0; i<twoDArray.length; i++) { 
			for(int j=0; j<twoDArray[i].length; j++) {
		if(twoDArray[i][j]%2==0) {
			System.out.print(twoDArray[i][j]+" ");
		}
		}
			
			

	}

	}
}
