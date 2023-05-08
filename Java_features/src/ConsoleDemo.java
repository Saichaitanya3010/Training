import java.util.Scanner;

public class ConsoleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter nmobile number");
		int mobile = sc.nextInt();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		String namePattern = "[A-Z][a-z]+";
		System.out.println(name.matches(namePattern));
		System.out.println("name" + name);
		
		String mobilePattern = "[7-9]{1}[0-9]{9}";
		//System.out.println(mobile.(mobilePattern));
		
		
		String emailPattern = "[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}";
		System.out.println(email.matches(emailPattern));
		System.out.println(email);

	}
}
