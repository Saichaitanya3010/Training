
public class DaemonDemo extends Thread{
	private int limit;
	
	public DaemonDemo(int limit,String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.limit=limit;
	}

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		for(int c=1;c<=limit;c++)
			System.out.println(name +":" +c);
	}
	public static void main(String[] args) {
		DaemonDemo d1=new DaemonDemo(25,"first");
		DaemonDemo d2=new DaemonDemo(40,"second");
		DaemonDemo d3=new DaemonDemo(100,"third");
		DaemonDemo d4=new DaemonDemo(500000,"DAEMON");
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
	

}
