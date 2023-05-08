
public class MyThread  extends Thread{
	private int data;

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int c=1;c<=50;c++)
			System.out.println(name +":" +  ++data);
	}
		public static void main(String[] args) {
			MyThread m1=new MyThread();
			m1.setName("First");
			
			MyThread m2=new MyThread();
			m2.setName("First");
			
			MyThread m3=new MyThread();
			m3.setName("First");
			
			m1.setPriority(MAX_PRIORITY);
			m3.setPriority(MIN_PRIORITY);
			m1.start();
			m2.start();
			m3.start();
			
			String name=Thread.currentThread().getName();
			for(int c=1;c<=50;c++)
				System.out.println(name + ":" +c);
		}
	}
	


