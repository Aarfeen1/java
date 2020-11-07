package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringEx2 {
public static void main(String[] args) {
	ArrayList<String> sub=new ArrayList<String>();
	sub.add("maths");
	sub.add("phy");
	sub.add("chem");
	sub.add("science");
	sub.add("m2");
	System.out.println(sub);
	System.out.println("-----------------------------------------------");
	for(String s:sub) {
		System.out.println(s);
	}
	System.out.println("-----------------------------------------------");
	Iterator<String> itr=sub.iterator();
	while(itr.hasNext()) {
		String st=itr.next();
		System.out.println(st);
	}
	System.out.println("-----------------------------------------------");
	ListIterator<String> litr=sub.listIterator();
	while(litr.hasNext()) {
		String st=litr.next();
		System.out.println(st);
	}
	System.out.println("-----------------------------------------------");
	ListIterator<String> litr1=sub.listIterator();
	while(litr1.hasPrevious()) {
		String st1=litr1.previous();
		System.out.println(st1);
	}
}
}
