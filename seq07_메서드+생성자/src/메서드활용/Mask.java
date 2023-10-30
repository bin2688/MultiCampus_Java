package 메서드활용;

public class Mask {
	String color;
	int price;
	int count;
	
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	
}
