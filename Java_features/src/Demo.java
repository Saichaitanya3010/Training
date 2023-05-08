
public class Demo<s> {
	private s data;

	public Demo(s data) {

		this.data = data;
	}

	public s getData() {
		return data;
	}

	public void setData(s data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<Integer> d1 = new Demo<Integer>(78);
		d1.setData(400);
		System.out.println(d1.getData());
		Demo<String> d2 = new Demo<String>("hello");
		d2.setData("sai");
		System.out.println(d2.getData());
	}

}
