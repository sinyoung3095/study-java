package practice;

public class Service {
	
	public void register(User user) {
		DBConecter.users.add(user);
	}
	
	public void write(String s) {
		DBConecter.post.add(s);
	}
	
	
}
