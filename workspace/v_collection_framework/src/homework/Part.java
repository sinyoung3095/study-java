package homework;

import java.util.Objects;

public class Part {
	private String name;
	private int price;
	private int count;
	
	public Part() {;}
	
	public Part(Part part) {
		this( part.getName(),part.getPrice(), part.getCount());
	}

	public Part(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ComuterPart [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Part other = (Part) obj;
		return count == other.count && Objects.equals(name, other.name) && price == other.price;
	}
	
	
}
