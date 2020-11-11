package ArrayList.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleEx {

	public static void main(String[] args) {
		ArrayList<Double> price=new ArrayList<Double>();
		price.add(20.99);
		price.add(30.88);
		price.add(40.77);
		price.add(10.44);
		price.add(5.000);
		price.add(7.987);
		System.out.println(price);
		Collections.sort(price);
		System.out.println(price);

	}
}
