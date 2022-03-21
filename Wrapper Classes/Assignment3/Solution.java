package Assignment3;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number (1 to 255) :");
		int intNum = sc.nextInt();
		
		String output = String.format("%8s",Integer.toBinaryString(intNum)).replace(' ', '0');
		System.out.println(output);	
	}
}

