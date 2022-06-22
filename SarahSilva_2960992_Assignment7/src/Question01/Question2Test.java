/*
 * Class Name: Question2Test
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question01;

import java.util.*;
import java.util.function.*;
public class Question2Test {
	public static void main(String[] args){
		
		// Creating a HashList
		MyHashList<Integer> list = new MyHashList<Integer>(7);
		list.add(23);
		list.add(15);
		list.add(99);
		list.add(2);
		list.add(56);
		list.add(43);
		list.add(62);
		list.add(84);
		list.add(12);
		list.add(45);
		list.add(23);
		list.add(3);
		list.add(3);
		list.add(7);
		list.add(54);
		list.add(34);
		list.add(18);
		list.add(54);
		
		System.out.println("Table: " + list);
		
		System.out.println();
		System.out.println("Getting the list of elements matching values whose hash code match that of 11");
		System.out.println(list.getList(11));
		System.out.println();
		
		System.out.println("Remove elements in ls from table");
		LinkedList toBeRemoved = new LinkedList();
		toBeRemoved.push(18);
		toBeRemoved.push(54);
		toBeRemoved.push(43);
		toBeRemoved.push(7);
		System.out.println("List to be removed: " + toBeRemoved);
		list.remove(toBeRemoved);
		System.out.println(list);
		System.out.println();
		

		System.out.println("Getting a list of values that satisfy a predicate pr");
		Predicate<Integer> greaterThan = x -> x>50;
		System.out.println(list.get(greaterThan));



		
		
		
		
		
		
		
		
		
		
		
	}
}