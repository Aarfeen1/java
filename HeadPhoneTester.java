package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HeadPhoneTester {
	public static void main(String[] args) {
		Headphone h1=new Headphone("mi", 3000, true);
		Headphone h2=new Headphone("micromax", 300, false);
		Headphone h3=new Headphone("sony", 5000, true);
		Headphone h4=new Headphone("boat", 200, true);
		Headphone h5=new Headphone("mi", 600, false);
		ArrayList<Headphone>  headAL=new ArrayList<Headphone>();
		
		headAL.add(h1);
		headAL.add(h2);
		headAL.add(h3);
		headAL.add(h4);
		headAL.add(h5);
		System.out.println(headAL);
		System.out.println("======================================");
		for(Headphone h:headAL) {
			System.out.println(h);
		}
		System.out.println("iterating using iterator!!!!!!!!!!!!!");
		Iterator <Headphone> itr=headAL.iterator();
		while(itr.hasNext()) {
			Headphone hdr=itr.next();
			System.out.println(hdr);
		}
		
		System.out.println(" ==========using listiterator =========================================");
		ListIterator<Headphone> litr=headAL.listIterator();
		while(litr.hasNext()) {
			Headphone hdr1=litr.next();
			System.out.println(hdr1);
		}
	
	System.out.println("------------------------------------------------");
		while(litr.hasPrevious()) {
			Headphone hdr1=litr.previous();
			System.out.println(hdr1);
		}}

}
