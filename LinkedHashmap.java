package hashmap;




import java.util.LinkedHashMap;

public class  LinkedHashmap {

	public static void main(String[] args) {
	LinkedHashMap<String,String> stud=new LinkedHashMap<String,String>();
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
