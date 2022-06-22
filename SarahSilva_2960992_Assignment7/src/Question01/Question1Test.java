/*
 * Class Name: Question1Test
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question01;

import java.util.*;
public class Question1Test {
	public static void main(String[] args){
		
		// creating a hashlist with 3D points
		MyHashList<Point3D> lst = new MyHashList<Point3D>(1000);
		// creating the points and adding them to the list
		for(int i=0; i<10000; i++) {
			int x = (int)(Math.random()*((1000-0)+1))+0;
			int y = (int)(Math.random()*((1000-0)+1))+0;
			int z = (int)(Math.random()*((1000-0)+1))+0;
			lst.add(new Point3D(x,y,z));
		}
		System.out.println("########## First list details ##########");
		System.out.println("Percentage used: " + lst.percentUsed());
		System.out.println("Largest Bucket: " + lst.largestBucket());
		System.out.println("Smallest Bucket: " + lst.smallestBucket());
		System.out.println("List Sizes: " + Arrays.toString(lst.listSizes()));
		System.out.println("Size each List: " + Arrays.toString(lst.sizeEachList()));
		System.out.println("Empty lists: " + lst.empty());
		
		// creating a second hashlist with 3D points
		MyHashList<Point3D> lst2 = new MyHashList<Point3D>(5000);
		// creating the points and adding them to the list
		for(int i=0; i<50000; i++) {
			int x = (int)(Math.random()*((5000-0)+1))+0;
			int y = (int)(Math.random()*((5000-0)+1))+0;
			int z = (int)(Math.random()*((5000-0)+1))+0;
			lst2.add(new Point3D(x,y,z));
		}
		
		System.out.println();
		System.out.println("########## Second list details ##########");
		System.out.println("Percentage used: " + lst2.percentUsed());
		System.out.println("Largest Bucket: " + lst2.largestBucket());
		System.out.println("Smallest Bucket: " + lst2.smallestBucket());
		System.out.println("List Sizes: " + Arrays.toString(lst2.listSizes()));
		System.out.println("Size each List: " + Arrays.toString(lst2.sizeEachList()));
		System.out.println("Empty lists: " + lst2.empty());
		
		// creating a third hashlist with 3D points
		MyHashList<Point3D> lst3 = new MyHashList<Point3D>(1500);
		// creating the points and adding them to the list
		for(int i=0; i<15000; i++) {
			int x = (int)(Math.random()*((1500-0)+1))+0;
			int y = (int)(Math.random()*((1500-0)+1))+0;
			int z = (int)(Math.random()*((1500-0)+1))+0;
			lst3.add(new Point3D(x,y,z));
		}
				
		System.out.println();
		System.out.println("########## Third list details ##########");
		System.out.println("Percentage used: " + lst3.percentUsed());
		System.out.println("Largest Bucket: " + lst3.largestBucket());
		System.out.println("Smallest Bucket: " + lst3.smallestBucket());
		System.out.println("List Sizes: " + Arrays.toString(lst3.listSizes()));
		System.out.println("Size each List: " + Arrays.toString(lst3.sizeEachList()));
		System.out.println("Empty lists: " + lst3.empty());
	
	
	
	
	}
}