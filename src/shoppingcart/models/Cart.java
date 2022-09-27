package shoppingcart.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cart {

	ArrayList<Item> items;

	public Cart() {
		super();
		items = new ArrayList<>();
	}
	
	public void setItem(int index, Item item) {
		items.set(index, new Item(item));
	}
	
	public Item getItem(int index) {
		return items.get(index);
	}
	
	 /**
	  * Name: add
	  * @param item
	  * @return boolean
	  *
	  * Inside the function:
	  *   1. Adds an item to the cart if it wasn't already added.
	  */
	public boolean add(Item item) {
		if(items.contains(item))
			return false;
		items.add(item);
		return true;
	}
	
	/**
	 * Name: remove
	 * @param name
	 *
	 * Inside the function:
	 *   1. Removes the item that matches the name passed in.
	 */
	public void remove(String name) {
		if (items.isEmpty()) {
			throw new IllegalStateException("The list is empty!");
		}
		items.forEach(index -> {
			if(index.getName().equals(name))
				items.remove(index);
		});
	}
	
	/**
	 *  Name: checkout
	 *  @return (String)
	 *
	 *  Inside the function:
	 *   1. Calculates the subtitle (price before tax).
	 *   2. Calculates the tax (assume tax is 13%).
	 *   3. Calculates total: subtitle + tax
	 *   4. Returns a String that resembles a receipt. See below.
	 */
	public String checkout() {
		if (items.isEmpty()) {
			throw new IllegalStateException("The list is empty!");
		}
		double subtotal = items.stream().mapToDouble(p -> p.getPrice()).sum();
		double tax = subtotal * 0.13;
		double total = subtotal + tax;
		return "\tRECEIPT\n\n" +
		        "\tSubtotal: $" + subtotal + "\n" +
		        "\tTax: $" + tax + "\n" +
		        "\tTotal: $" + total + "\n";
	}

	@Override
	public String toString() {
		return items.stream().map(o -> o.getName()).collect(Collectors.joining("\n"));
	}

	public boolean isEmpty() {
        return this.items.isEmpty();
    }
	
}
