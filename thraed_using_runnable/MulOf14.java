package thread.example.usingrunnable;

public class MulOf14 implements Runnable{

	@Override
	public void run() {
		int num=14;
		for(int i=0;i<=5;i++) {
			System.out.println(num*i);
			
		}
		
	}

}
