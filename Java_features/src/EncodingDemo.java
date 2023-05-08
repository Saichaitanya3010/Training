import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
public class EncodingDemo {
	public static void main(String[] args) {
		String password="p@ssw@rd123";
		System.out.println(password);
		Encoder encoder=Base64.getEncoder();
		String encoded=encoder.encodeToString(password.getBytes());
		System.out.println(encoded);
		Decoder decoder=Base64.getDecoder();
		byte[] decoded=decoder.decode(encoded.getBytes());
		System.out.println(new String(decoded));
	}

}
