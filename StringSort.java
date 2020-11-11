package ArrayList.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args) {
		ArrayList<String> stringArr=new  ArrayList <String>();
		stringArr.add("sun");
		stringArr.add("mon");
		stringArr.add("tue");
		stringArr.add("wed");
		stringArr.add("thurs");
		System.out.println(stringArr);
		
		Collections.sort(stringArr);
		System.out.println(stringArr);
		Collections.reverse(stringArr);
		System.out.println(stringArr);

	}

}
