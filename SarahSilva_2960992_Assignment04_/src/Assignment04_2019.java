/*
 * Student name: Sarah Narayamy Tavares Silva
 *
 * Student number: 2960992
 *
 *
 * For Assignment 3 please complete the methods listed below for class LinkedListHT.
 * In each case the comment inserted in the method describes its purpose.
 * Test all methods properly in the main method.
 */
import java.util.*;
public class Assignment04_2019 {
  public static void main(String[] args) {
    LinkedListHT ll = new LinkedListHT();

    System.out.println("~~~ Test addHead Method ~~~");
    System.out.println("Size of list should be 0, actually is: "+ll.size());
    System.out.println();
    ll.addHead(44);
    ll.addHead(222);
    ll.addHead(6);
    ll.addHead(222);
    System.out.println("List should be [222, 6, 222, 44].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Size of list should be 4, actually is: "+ll.size());
    System.out.println();
    System.out.println("Head should be 222 actually is: "+ll.getHeadValue() );
    System.out.println("Tail should be 44 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();


    System.out.println("~~~ Test sort Method ~~~");
    ll.sort();
    System.out.println("List should be [6, 44, 222, 222].\nActually is: "+ll);
    System.out.println();
    System.out.println("Head should be 6 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 222 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test addTail Method ~~~");
    System.out.println(ll);
    ll.addTail(1);
    ll.addTail(9);
    System.out.println("Size of list should be 6, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [6, 44, 222, 222, 1, 9].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 6 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 9 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test addTail(LinkedListHT) Method ~~~");
    LinkedListHT ll2 = new LinkedListHT();
    ll2.addTail(999); ll2.addTail(111);
    System.out.println(ll2);
    ll.addTail(ll2);
    System.out.println("Size of list should be 8, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [6, 44, 222, 222, 1, 9, 999, 111].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 6 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 111 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test toArray Method ~~~");
    int[] arr = ll.toArray();
    System.out.println("Length of Array should be 8, actually is: "+arr.length);
    System.out.println();
    System.out.print("Array should be [6, 44, 222, 222, 1, 9, 999, 111].\nActually is:    ");
    System.out.println(Arrays.toString(arr));

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test sort Method ~~~");
    ll.sort();
    System.out.println("Size of list should be 8, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [1, 6, 9, 44, 111, 222, 222, 999].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 1 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 999 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test delTail Method ~~~");
    ll.delTail();
    System.out.println("Size of list should be 7, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [1, 6, 9, 44, 111, 222, 222].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 1 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 222 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test sort Method ~~~");
    ll.addHead(-8); ll.addHead(222);
    ll.sort();
    System.out.println("Size of list should be 9, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [-8, 1, 6, 9, 44, 111, 222, 222, 222].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be -8 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 222 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test size Method ~~~");
    System.out.println("Size of list should be 9, actually is: "+ll.size());
    System.out.println();
    ll.delTail(); ll.delTail(); ll.delTail();
    System.out.println("Size of list should be 6, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [-8, 1, 6, 9, 44, 111].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be -8 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 111 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test delHead Method ~~~");
    ll.delHead();
    System.out.println("Size of list should be 5, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [1, 6, 9, 44, 111].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 1 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 111 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test sum Method ~~~");
    System.out.println("Size of list should be 5, actually is: "+ll.size());
    System.out.println();
    System.out.println("Sum of list should be 171, actually is: "+ll.sum());
    System.out.println();
    ll.addTail(2);
    System.out.println("Size of list should be 6, actually is: "+ll.size());
    System.out.println();
    System.out.println("Sum of list should be 173, actually is: "+ll.sum());

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test count Method ~~~");
    System.out.println("Size of list should be 6, actually is: "+ll.size());
    System.out.println();
    System.out.println("Count of number 5 should be 0, actually is: "+ll.count(5));
    System.out.println();
    System.out.println("Count of number 6 should be 1, actually is: "+ll.count(6));
    System.out.println();
    ll.addTail(6);
    System.out.println("Size of list should be 7, actually is: "+ll.size());
    System.out.println();
    System.out.println("Count of number 6 should be 2, actually is: "+ll.count(6));
    System.out.println();
    ll.addHead(6);
    System.out.println("Size of list should be 8, actually is: "+ll.size());
    System.out.println();
    System.out.println("Count of number 6 should be 3, actually is: "+ll.count(6));

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test reverse Method ~~~");
    ll.addHead(22);
    System.out.println("Size of list should be 9, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [22, 6, 1, 6, 9, 44, 111, 2, 6].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 22 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 6 actually is: "+ll.getTailValue() );
    System.out.println();
    ll.reverse();
    System.out.println("~~ After Reverse ~~");
    System.out.println("Size of list should be 9, actually is: "+ll.size());
    System.out.println();
    System.out.println("List should be [6, 2, 111, 44, 9, 6, 1, 6, 22].\nActually is:   "+ll);
    System.out.println();
    System.out.println("Head should be 6 actually is: "+ll.getHeadValue() );
    System.out.println();
    System.out.println("Tail should be 22 actually is: "+ll.getTailValue() );

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("~~~ Test equals Method ~~~");
    LinkedListHT ll3 = new LinkedListHT();
    ll3.addHead(22); ll3.addHead(6); ll3.addHead(1);
    ll3.addHead(6); ll3.addHead(9); ll3.addHead(44);
    ll3.addHead(111); ll3.addHead(2); ll3.addHead(6);
    System.out.println("ll & null, should not be equal (false): "+ll.equals(null));
    System.out.println();
    System.out.println("ll & Integer(5), should not be equal (false): "+ll.equals(new Integer(5)));
    System.out.println();
    System.out.println("ll & ll2, should not be equal (false): "+ll.equals(ll2));
    System.out.println();
    System.out.println("ll & ll3, should be equal (false): "+ll.equals(ll3));
    System.out.println();
    System.out.println("ll : "+ll);
    System.out.println("ll3: "+ll3);
    System.out.println();
    System.out.println();
  }
}
class LinkedListHT{
	private Node head = null;
	private Node tail = null; //empty list

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getHeadValue() {
		return head.data();
	}

	public int getTailValue() {
		return tail.data();
	}

	//add at head
	public void addTail(int x){ 
		Node nw = new Node(x);
		if(head == null){
			head = nw;
			tail = nw;
		}
		else{
			tail.setNext(nw);
			tail = nw;
		}
	}
	
	public void addTail(LinkedListHT lst){
		//add given list to tail of existing list
		Node newNode = new Node(lst);
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail != null) {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void addHead(int x){
		Node newNode = new Node(x);
		newNode.setNext(this.head);
		this.head = newNode;
		
		
	}

	public int[] toArray(){
		//return int array of list values
		int[] array = new int[this.size()];
		Node current = head;
		int j = 0;
		while(current != null) {
			array[j] = current.data();
			current = current.next();
			j = j + 1;
		}
		return array;
	}

	/*public void sort(){
		//sort elements in list
		
		
	}*/

	public int size(){
		//return number of nodes in the list
		int size = 0;
		Node current = this.head;
		
		while(current != null) {
			size ++;
			current = current.next();
		}
		return size;
	}

	public void delHead(){
		//remove element at head of list
		this.head = this.head.next();		
	}

	public void delTail(){
		//remove element at tail of list
		this.tail = this.tail.next();
	}

	public int sum(){
		//calculate sum of values in the list
		Node current = this.head;
		int sum = 0;
		while(current != null) {
			sum = sum + current.data();
			current = current.next();			
		}
		return sum;
	}

	public int count(int x){
		//count number of occurrences of x in list
		Node current = this.head;
		int count = 0;
		while(current != null) {
			if(current.data() == x) {
				count++;
			}
			current = current.next();			
		}
		return count;
	}

	/*public void reverse(){
		//reverse the order of the elements in the list
	}

	public boolean equals(Object ob){
		// method to test this list with another list for equality
		// Two lists equal if they have the same size and corresponding
		// values are equal
	}*/
	


	public boolean contains(int x){
		Node k = head;
		boolean found = false;
		while(k != null && !found){
			if(k.data() == x) found = true;
			else k = k.next();
		}
		return found;
	}

	public void remove(int x){
		Node k = head;
		Node bk = head;
		boolean found = false;
		while(k != null && !found){
			if(k.data() == x) {
				found = true;
			}
			else{
				bk = k;
				k = k.next();
			}
		}
		if(found){
			if(k == head)
				head = k.next();
			else if(k == tail){
			   bk.setNext(null);
			   tail = bk;
			}
			else {
				bk.setNext(k.next());
			}
		}
	}

	public String toString(){
		if(head == null) return "[]";
		String s = "[";
		Node k = head;
		while(k.next() != null){
			s = s + k.data()+", ";
			k = k.next();
		}
		s = s + k.data()+"]";
		return s;
	}

	private class Node{
		int data;
		Node next;

		public Node(int x){
			data = x; next = null;
		}

		public Node next(){
			return next;
		}

		public void setNext(Node p){
			next = p;
		}

		public void set(int x){
			data = x;
		}

		public int data(){
			return data;
		}
	}
}
