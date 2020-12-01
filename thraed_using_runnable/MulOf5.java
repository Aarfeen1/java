package thread.example.usingrunnable;

public class MulOf5 implements Runnable {

	@Override
	public void run() {
		System.out.println("inside thread 2");
		int num=5;
		for(int i=1;i<=6;i++) {
			
			System.out.println(num*i);
		}
	}
	

}
