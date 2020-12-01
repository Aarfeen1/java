package hashmap;

import java.util.HashMap;

public class Hashmapex {

	public static void main(String[] args) {
	HashMap<String,String> stud=new HashMap<String,String>();
	stud.put("1tj15cse2020", "raaj");
	stud.put("1tj1415cs098", "rahim");
	stud.put("1thj16cso044", "kumar");
	stud.put("1tj15cse2020", "anand");
	System.out.println(stud);
	stud.put(null,null );
	System.out.println(stud);
	stud.put(null,"mohan" );
	System.out.println(stud);
	
	

	}

}
