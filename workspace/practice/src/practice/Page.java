package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Page {
	public static void main(String[] args) {
		User[] user = {
				new User(1,"김신영",10511),
				new User(2,"배진영",10990),
				
		};
		Service sur = new Service();
		
		for (int i = 0; i < user.length; i++) {
			
			DBConecter.users.add(user[i]);
		}
		
		DBConecter.users.stream().filter(data->data.getId()==1).forEach(System.out::print);
		DBConecter.users.sort(null);
//		DBConecter.users.get(0).setId(3);
		System.out.println(DBConecter.users);
		
		}
}
