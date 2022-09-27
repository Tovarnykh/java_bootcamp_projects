package shoppingcart.models;

public class Store {

	private Item[][] items;

	public Store() {
		super();
		items = new Item[7][3];
	}

	public Item getItem(int row, int column) {
		
		if (row < 0 || row > 7)
			throw new IllegalArgumentException("Bad row argument");
		if (column < 0 || row > 3)
			throw new IllegalArgumentException("Bad column argument");
		if (items[row][column]==null) {
			throw new IllegalStateException("The list is empty!");
		}
		return new Item(items[row][column]);
	}

	public void setItem(int row, int column, Item item) {

		if (row < 0 || row > 7)
			throw new IllegalArgumentException("Bad row argument");
		if (column < 0 || column > 3)
			throw new IllegalArgumentException("Bad column argument");
		if (!(item instanceof Item))
			throw new IllegalArgumentException("Bad Item argument");

		this.items[row][column] = new Item(item);
	}

	@Override
	public String toString() {
		String temp = "";

		for (int i = 0; i < items.length; i++) {
			switch (i) {
			case 0:
				temp += "\tDRINKS:        ";
				break;
			case 1:
				temp += "\tCEREAL:        ";
				break;
			case 2:
				temp += "\tDAIRY:         ";
				break;
			case 3:
				temp += "\tDELI:          ";
				break;
			case 4:
				temp += "\tGREENS:        ";
				break;
			case 5:
				temp += "\tCLOTHING:      ";
				break;
			case 6:
				temp += "\tELECTRONICS:   ";
				break;
			}
			for (int j = 0; j < items[i].length; j++) {
				temp += items[i][j].toString();
			}
			temp += "\n\n";
		}
		temp += "\t************************************************************************\n";
		return temp;
	}

}
