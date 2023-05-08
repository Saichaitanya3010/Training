@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye() {
		return "Good Bye";
	}
	static void greetings() {
		System.out.println("Hola Amigo!");
	}

}
