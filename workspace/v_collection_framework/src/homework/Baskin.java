package homework;

import list.task.DBConnecter;

public class Baskin {

	public void addIce(Icecream a) {
		DBConnecter.ice.add(a);
	}
	
	public void recommend(String a) {
		for (int i = 0; i < DBConnecter.ice.size(); i++) {
			if (DBConnecter.ice.get(i).getTaste().equals(a)) {
				System.out.println(DBConnecter.ice.get(i).getName());
			}
		}
	}
//	public void 

	
}
