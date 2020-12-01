package thread.example.usingextends;

public class ThreadEx1 extends Thread {
	public void run() {
		System.out.println("inside thread 2");
		int num=5;
		for(int i=6;i<=10;i++) {
			
			System.out.println(num*i);
		}
		System.out.println("thread 2 ended");
		
	}

}
