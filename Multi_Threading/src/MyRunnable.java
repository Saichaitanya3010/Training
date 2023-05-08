
public class MyRunnable implements Runnable {
   private int data;
	@Override
	public void run() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	for(int i=0;i<40;i++)
		System.out.println(name + ":"  + ++data);
		
	}
	public static void main(String[] args) {
		Runnable mr=new MyRunnable();
		Thread t1=new Thread(mr);
		t1.setName("first");
		Thread t2=new Thread(mr);
	t2.setName("Second");
	
	
		t1.start();
		t2.start();
		
	}

}
