
public class SyncDemo implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		print(name);
		
		
	}
	private synchronized void print(String name) {
		try {
			System.out.print("[");
			Thread.sleep(1000);
			
			System.out.print(name);
			Thread.sleep(1000);
			System.out.print("]");
			//Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		SyncDemo sc=new SyncDemo();
		Thread t1=new Thread(sc,"alfa");
		Thread t2=new Thread(sc,"beta");
		Thread t3=new Thread(sc,"gamma");
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
