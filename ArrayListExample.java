package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <Double> priceOf=new ArrayList<Double>();
		priceOf.add(20.9);
		priceOf.add(200.6);
		priceOf.add(6000.0);
		priceOf.add(2000.0);
		priceOf.add(209485.9);
		System.out.println(priceOf);
        priceOf.add(null);
        priceOf.add(20.9);
        System.out.println(priceOf);
	    System.out.println(priceOf.size());
	    System.out.println("1st element of arraylist" +priceOf.get(0));
	priceOf.set(2, 9.0);
	
	  System.out.println(priceOf);
	  System.out.println("index of "+priceOf.indexOf(6000.0));
	  System.out.println("lastindex of 20.9  is "+priceOf.lastIndexOf(20.9));
	  priceOf.remove(1);
	  System.out.println(priceOf);
	  priceOf.remove(9.0);
	  System.out.println(priceOf);
	  
	}

}
