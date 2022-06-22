/*
 * Class Name: MyHashList
 *
 * Student Name: Sarah Narayamy Tavares Silva
 * Student Number: 2960992
 * 
 */

package Question01;

import java.util.*;
import java.util.function.*;
class MyHashList<E> implements Iterable<E>{
	private ArrayList<LinkedList<E>> table;

	public MyHashList(int n){
		// n = the number of lists to create -
		// it does NOT limit the number of elements in the table
		table = new ArrayList<>();
		for(int j = 0; j < n; j++)
			table.add(new LinkedList<>());
	}

	private int hashC(E x){
		int k = x.hashCode();
		//an alternative is to mask the minus using
		//int k = x.hashCode() & 0x7fffffff;
		int h = Math.abs(k % table.size());
		return(h);
	}

	public void add(E x){
		int index = hashC(x);
		table.get(index).addFirst(x);
	}

	public boolean contains(E x){
		int index = hashC(x);
		return(table.get(index).contains(x));
	}

	public boolean remove(E x){
		int index = hashC(x);
		return table.get(index).remove(x);
	}

	public int size(){
		int count = 0;
		for(int j = 0; j < table.size();j++) {
			count += table.get(j).size();
		}
		return count;
	}

	// Assignment Methods Start

	// Returns a copy of the list of elements matching
	// values whose hash code match that of x
	public LinkedList<E> getList(E x) {
		LinkedList<E> lst = new LinkedList<E>();
		for(int j=0; j<table.size(); j++) {
			for(E y: table.get(j)) {
				if(hashC(y) == (hashC(x))) {
					lst.add(y);
				}
			}
		}
		return lst;
	}
	
	// Remove elements in ls from table
	public void remove(List<E> ls) {
		 for(int j=0; j<ls.size(); j++) {
			 int i = hashC(ls.get(j));
			 for(int n=0; n<table.get(i).size(); n++) {
				 table.get(i).remove(ls.get(j));
			 }
		 }
	}
	
	// Returns the list of values that satisfy the
	// predicate pr
	List<E> get(Predicate<E> pr) {
		List<E> lst = new ArrayList<>();
		for(int j=0; j<table.size(); j++) {
			for(E y : table.get(j)) {
				if(pr.test(y)) {
					lst.add(y);
				}
			}
		}
		return lst;
	}
		

	// Assignment Methods End

	public Iterator<E> iterator(){
		ArrayList<E> items = new ArrayList<E>();
		int ind = 0;
		while(ind < table.size()){
			Iterator<E> it = table.get(ind).iterator();
			while(it.hasNext()) items.add(it.next());
			ind++;
		}
		return items.iterator();
	}

	public String toString(){
		return table.toString();
	}
	
	// calculates the percentage of usage in the hashList
	public double percentUsed() {
		int count=0;
		for(int j=0; j<table.size(); j++) {
			if(table.get(j).size()>0) {
				count++;
			}
		}
		double p = count*100.0/table.size();
		return p;
	}
	
	// Verifies which bucket has the largest amount of elements
	public int largestBucket() {
		int max = 0;
		for(int j=0; j<table.size(); j++) {
			if(table.get(j).size()>max) {
				max = table.get(j).size();
			}
		}
		return max;
	}
	
	// Verifies which bucket has the smallest amount of elements
	public int smallestBucket() {
		int min = table.get(0).size();
		for(int j = 1; j<table.size(); j++) {
			if(table.get(j).size()<min) {
				min = table.get(j).size();
			}
		}
		return min;
	}
	
	// checks the number of buckets with each number of elements
	public int[] listSizes(){
		int n = this.largestBucket();
		int d[] = new int[n+1];
		for(int j=0; j<d.length; j++) {
			d[j]=0;
		}
		for(int j=0; j<table.size(); j++) {
			int m = table.get(j).size();
			d[m] = d[m]+1;
		}
		return d;
	}
	
	// cheks the sizes of each list in the hashList
	public int[] sizeEachList() {
		int[] d = new int[table.size()];
		for(int i=0; i<table.size(); i++) {
			d[i] = table.get(i).size();
		}
		return d;
	}
	
	// Verify whether there is any empty bucket in the hashList
	public int empty() {
		int count = 0;
		for(int j=0; j<table.size(); j++) {
			if(table.get(j).size()==0) {
				count++;
			}
		}
		return count;
	}
	
}