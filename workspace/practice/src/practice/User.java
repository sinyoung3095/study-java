package practice;

import java.util.Objects;

public class User {
	private int id;
	private String name;
	private int phone;
	
	public User() {;}
	
	public User(User user) {
		this(user.getId(),user.getName(), user.getPhone());
	}

	public User(int id, String name, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	
	
}
