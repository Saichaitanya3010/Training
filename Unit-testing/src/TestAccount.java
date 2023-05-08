import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	public Account acnt;
	@BeforeEach
	public void init() {
		acnt=new Account(1000);
	}
	
	@Test
	public void testValidDeposite() {
		assertSame(2000,acnt.deposite(1000));

}
	@Test
	public void testNegativeDeposite() {
		assertThrows(NumberFormatException.class,()->acnt.deposite(-1000));
	}
	
	@Test
	public void testValidWithdraw() throws BalanceException {
		assertSame(500,acnt.withdraw(500));
		
		
	}
	@Test
	public void testNegativeWithdraw() {
		assertThrows(NumberFormatException.class,()->acnt.withdraw(-1000));
		
	}
	@Test
	public void testInValidWithdraw() {
		assertThrows(BalanceException.class,()->acnt.withdraw(2000));
		
	}
	
	
	}
