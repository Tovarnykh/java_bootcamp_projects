package shoppingcart.models;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {

	Cart cart;

	@BeforeEach void initialize() {
		cart = new Cart();
		cart.add(new Item("Pepsi", 1.99));
		cart.add(new Item("Crush", 1.99));
		
	}

	@Test
	void containsTest() {
		assertTrue(cart.contains(new Item("Crush", 1.99)));
	}
	
	@Test
	void addTest() {
		assertFalse(cart.add(new Item("Pepsi", 1.99)));
	}
	
	@Test
	void removeTest() {
		cart.remove("Crush");
		assertFalse(cart.contains(new Item("Crush", 1.99)));
	}

}
