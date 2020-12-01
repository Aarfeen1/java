package thread.example.usingrunnable;

public class MulTester {
	public static void main(String[] args) {
		MulOf14 m=new MulOf14();
		Thread t=new Thread(m);
		t.start();
		MulOf5 m1=new  MulOf5();
		Thread t1=new Thread(m1);
		t1.start();
		
		
	}

	
}
