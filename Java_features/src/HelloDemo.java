
public class HelloDemo {
	public static void main(String[] args) {
		Hello h =()-> "Hello world";
		System.out.println(h.sayHello());
		Hello h2= () ->{
			String msg="hola";
			return msg;
		};
		System.out.println(h2.sayHello());
		System.out.println(h.sayBye());
		Hello.greetings();
	}

}
