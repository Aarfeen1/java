package ArrayList;

import java.util.ArrayList;

public class CharEx {

	public static void main(String[] args) {
		
				ArrayList <Character> letters=new ArrayList<Character>();
				letters.add('a');
				letters.add('b');
				letters.add('c');
				letters.add('d');
				letters.add('e');
				letters.add('f');
				
				System.out.println(letters);
		        letters.add(null);
		       letters.add('a');
		        System.out.println(letters);
			    System.out.println(letters.size());
			    System.out.println("1st element of arraylist" +letters.get(0));
		letters.set(2, 'A');
			
			  System.out.println(letters);
			  System.out.println("index of "+letters.indexOf('c'));
			  System.out.println("lastindex of 20.9  is "+ letters.lastIndexOf('a'));
			  
			  letters.remove(1);
			  
			  System.out.println(letters);
			  
			  letters.remove('b');
			  
			  System.out.println(letters);
			  
			}

		}
	
