package shoppingcart.models;

import java.util.Objects;

public class Item {
	
	private String name;
	private double price;
	
	public Item(String name, double price) {
		super();
		if(name == null || name == "")
			throw new IllegalArgumentException("Name can not be blank or null");
		if(price<0 )
			throw new IllegalArgumentException("Price cant be less the 0");
		this.name = name;
		this.price = price;
	}
	
	public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name == "" )
			throw new IllegalArgumentException("Name can not be blank or null");
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0 )
			throw new IllegalArgumentException("Price cant be less the 0");
			this.price = price;
	}
	
	public Item copy() {
		return new Item(name, price);
	}

	@Override
	public String toString() {
		return name + ": $" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Item))
			return false;
		Item item = (Item)obj;
		return item.getName().equals(this.getName())
				&& item.getPrice()==this.getPrice();
	}

	
	
	
	
}
