package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		// Maximum and minimum numbers in the array?
		int[]array = {10, 9, 12, 30, -5, 15, 225};
		int largest = array[0];
		int secondLargest = 0;
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				secondLargest = largest;
				largest=array[i];
			}else if(array[i]>secondLargest) {
				secondLargest=array[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	
		System.out.println("--------------------------------");
		
		int [][]aray={
			{1,2,3,4,5,6,7,8},
			{1,2,3,4,5},
			};
		int sum=0;
		for(int row=0; row<aray.length;row++) {
			
			for(int col=0; col<aray[row].length; col++) {
				
				System.out.print(aray[row][col]+" ");
				sum=sum+aray[row][col];
				
			}
			
		}
		System.out.println("Sum = "+sum);
			
	}

}
