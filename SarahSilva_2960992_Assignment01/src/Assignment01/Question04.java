/*
 * Class Name: Question04
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
package Assignment01;

import java.util.Arrays;

// The recursive function fibSequence() described
// in the book and in the lectures generates and
// prints the first n terms in the fibonacci
// sequence. Re-write this function so that it
// actually stores the terms in an array of size n,
// where n is the number of terms required, as it
// generates them. The signature of this function
// is: void fibSequence(int i,int n, int f[]){ … }

public class Question04 {
	
	static void fibSequence(int i, int n, int[] f){
		if(i==0) {
			f[i]=1;
		}
		else if(i==1) {
			f[i]=1;
		}
		else {
			f[i]=f[i-1]+f[i-2];
		}
		if(i+1<n) {
			fibSequence(i+1, n, f);
		}
	}
	
	public static void main(String[] args) {
		int n = 9;
		int[] array = new int[n];
		fibSequence(0, n, array);
		System.out.print(Arrays.toString(array));

		}
	

}
