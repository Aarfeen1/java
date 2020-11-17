package Linkedlist;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> num=new LinkedList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(30);
		num.add(40);
		
		num.add(null);
		System.out.println(num);
		
System.out.println(num.peek());
System.out.println(num.peekLast());
System.out.println(num.poll());
System.out.println(num.pollFirst());
System.out.println(num);

System.out.println(num.get(2));
num.set(3, 70);
System.out.println(num);
	}

}
