import static com.ibm.cc.Currency.*;
public class CurrencyDemo {
	public static void main(String[] args) {
		System.out.println(convert(USD,INR,10));
		System.out.println(convert(UKP,USD,10));
		System.out.println(convert(UKP,INR,10));
		
	}

}
