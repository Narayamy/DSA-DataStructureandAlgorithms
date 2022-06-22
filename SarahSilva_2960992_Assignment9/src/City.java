/*
 * Class Name: City
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */
import java.util.*;
public final class City implements Comparable<City>{
 	private  String city;

 	City(String n){
 		assert n != null && n != "";
 		city = n;
 	}

 	String city(){
 		return city;
 	}

 	public String toString(){
 		return city;
 	}

 	public boolean equals(Object ob){
 		if(!(ob instanceof City))
 			return false;
 		City c = (City)ob;
 		return city.equals(c.city);
	}

	public int hashCode(){
		return city.hashCode();
	}

	public int compareTo(City c){
		if(c == null)
			return -1;
		return city.compareTo(c.city);
	}
}