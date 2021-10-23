package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {
		// write a program to check the whether a given numbers is prime or not?
		//a numbers that is divisible only by itself and(e.g.2,3,5,7,11)negative numbers are not prime numbers
		int number=15;
		boolean isPrime=true;
		if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println(number +" is prime "+ isPrime);

	}

}
