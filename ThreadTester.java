package thread.example.usingextends;

public class ThreadTester {
public static void main(String[] args) {
	System.out.println("thread details are "+Thread.currentThread().getName());
	System.out.println("thread prgm starrtted");
	ThreadEx t1=new ThreadEx();
	t1.start();
	ThreadEx1 t2=new ThreadEx1();
	t2.start();
	System.out.println("thread programme ended");
}
}
