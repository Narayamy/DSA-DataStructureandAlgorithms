/*
 * Class Name: Question02
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Assignment01;

// Write a recursive function that takes an integer
// array as one of its arguments and computes
// the frequency of the number 0 in the array.

public class Question02 {
	
	static void zeroFrequency(int f[], int i, int c) {
		if(i==f.length) {
			System.out.println(c);
		}
		else {
			if(f[i]==0) {
				zeroFrequency(f, i+1, c+1);
			}
			else {
				zeroFrequency(f, i+1, c);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int array[] = {2,0,0,0,9,0,5,67};
		zeroFrequency(array, 0, 0);

	}

}
