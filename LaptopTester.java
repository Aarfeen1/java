package ArrayList;

import java.util.ArrayList;

public class LaptopTester {
public static void main(String[] args) {
	
	
	
	Laptop lp=new Laptop("sony", 50000.00, false);

	Laptop lp1=new Laptop("lenovo", 350000.00, false);

	Laptop lp2=new Laptop("dell", 150000.00, true);

	Laptop lp3=new Laptop("apple", 450000.00, false);

	Laptop lp4=new Laptop("hp",650000.00, true);
	ArrayList<Laptop> lapList=new ArrayList<Laptop>();
	lapList.add(lp);
	lapList.add(lp1);
	lapList.add(lp2);
	lapList.add(lp3);
	lapList.add(lp4);
	System.out.println(lapList);
	// change the value of price of laptop
	for(int i=0;i<lapList.size();i++)
	{
		
		Laptop l=lapList.get(i);//
		double price=l.getPrice();//
		l.setPrice(price+(price*15/100));//
		System.out.println(l);
		
	}
	
	
}
}
