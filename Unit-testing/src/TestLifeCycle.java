import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	public List<String> cart;
	@BeforeAll
	public static void setUp() {
		System.out.println("setup before all test cases");
	}
	@AfterAll
	public static void teaDown() {
		System.out.println("teardown after all test cases");
	}
	
	@BeforeEach
	public  void setUpEach() {
		cart=new ArrayList<String>();
		//cart.add("kiiw");
		System.out.println("setup before each test caeses");
	}
	
	@AfterEach
	public  void tearDownEach() {
		cart=null;
		
		System.out.println("tear down after each test cases");
	}
	
	//@Disabled
	@Test
	public void testEmptyCart() {
		System.out.println("testing empty cart");
		assertTrue(cart.isEmpty());
	}
	
	@Test
	public void testOneItem() {
		cart.add("applt");
		System.out.println("testing cart with 1 item");
		assertEquals(1,cart.size());
	}

}
