/*
 * Class Name: Explorer
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
import java.util.*;
public final class Explorer implements Comparable<Explorer>{
 	private final String explorer;

 	Explorer(String n){
 		assert n != null && n != "";
 		explorer = n;
 	}
 	String explorer(){
 		return explorer;
 	}

 	public String toString(){
 		return explorer;
 	}

 	public boolean equals(Object ob){
 		if(!(ob instanceof Explorer))
 			return false;
 		Explorer exp = (Explorer)ob;
 		return explorer.equals(exp.explorer);
	}

	public int hashCode(){
		return explorer.hashCode();
	}

	public int compareTo(Explorer exp){
		if(exp == null) return -1;
		return explorer.compareTo(exp.explorer);
	}
}