package thread.example.usingextends;

public class ThreadEx  extends Thread{
	public void run() {
		System.out.println("inside thrsead 1");
		int num=5;
		for(int i=0;i<=5;i++) {
			System.out.println(num*i);
			
		}
		System.out.println("thread 1 eneded");
	}

}
