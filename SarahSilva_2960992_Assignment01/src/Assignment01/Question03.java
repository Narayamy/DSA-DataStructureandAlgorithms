/*
 * Class Name: Question03
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
package Assignment01;

import java.util.Scanner;

// Write a recursive function that prints a given
// positive integer value as its binary equivalent.
// For example, if the value is 11 the output
// should be 1011.

public class Question03 {
	
	public static void binary(int x){

		int quotient;
		int remainder;
		int bin;
		if(x<=0){
		}
		else {
			quotient = x/2;
			remainder = x%2;
			bin = remainder;
			x = quotient;
			binary(x);
			System.out.print(bin);

		}
	}
	
	
public static void main(String[] args) {
	
	System.out.println("Please, input a number:");	
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	binary(x);
	input.close();

	}

}
