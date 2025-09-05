package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Page {
	public static void main(String[] args) {

		User user = new User();
		User[] use = null;
		
		use = new User[] { new User("test", 10, "서울", "010551531531"), new User("test1", 10, "서울", "010412412"),
			new User("test2", 10, "서울", "01024324421"), new User("test3", 10, "서울", "010432342431")

		};
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(use));

		User test = new User("test4", 10, "서울", "010551531531");
		test.plus(2);
		System.out.println(test.getName());
		users.add(test);

		users.stream().filter(data -> data.getName() == "test4").forEach(System.out::print);
		users.forEach(System.out::print);
		
		int[] arr = null;
		arr = new int[]{1,2,3,4,5};
	}
}
