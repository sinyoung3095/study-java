package test;

import java.util.Objects;

public class User {
	private String name;
	private int age;
	private String address;
	private String phone;
	
	public User() {;}
	public User(User user) {
		this(user.getName(),user.getAge(),user.getAddress(), user.getPhone());
	}
	
	public User(String name, int age, String address, String phon) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phon;
	}
	
	public void plus(int a) {
		this.setAge(this.getAge()+a); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhon(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
}
