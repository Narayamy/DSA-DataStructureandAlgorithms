/*
 * Class Name: Question01
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Assignment01;

import java.util.Scanner;

// Write a recursive function that reads a list of
// integer values, sentinel -1, and prints all
// multiples of 3. The signature of the function is:
// void multipleThree(Scanner in){ … }

public class Question01 {
	
	static int sentinel = -1;
	public static void multipleThree(Scanner in){
		int x = in.nextInt();
		if(x==sentinel){
		}
		else {
			multipleThree(in);
			if(x%3==0) {
				System.out.println(x);
			}
		}
	}

public static void main(String[] args) {
	System.out.println("Please, input a number:");	
	Scanner input = new Scanner(System.in);
		multipleThree(input);

	}
	
	
}
