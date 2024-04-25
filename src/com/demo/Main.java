package com.demo;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(secondLargestNumInArr(new int[]{1, 6, 4, 5}));
		
	}
	
	public static int secondLargestNumInArr(int[] array) {
		if(array.length < 2) {
			return -1;
		}
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : array) {
			if(num > firstMax) {
				secondMax = firstMax; 
				firstMax = num;
			}else if(num > secondMax && num != firstMax) {
				secondMax = num;
			}
		}
		
		
		return secondMax;
	}
}
