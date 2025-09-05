package homework;

import java.util.Arrays;
import java.util.Objects;

public class Icecream {
	private String name;
	private int price;
	private String[] taste;
	
	
	
	public Icecream() {;}
	
	public Icecream(Icecream ice) {
		this(ice.getName(),ice.getPrice(),ice.getTaste());
	}
	

	public Icecream(String name, int price, String[] taste) {
		super();
		this.name = name;
		this.price = price;
		this.taste = taste;
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

	public String[] getTaste() {
		return taste;
	}

	public void setTaste(String[] taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + ", taste=" + Arrays.toString(taste) + "]";
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Icecream other = (Icecream) obj;
		return Objects.equals(name, other.name) && price == other.price && Arrays.equals(taste, other.taste);
	}
	
	
}
