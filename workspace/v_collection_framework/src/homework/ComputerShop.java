package homework;

import list.task.DBConnecter;

public class ComputerShop {
	
	public void addPart(Part part) {
		DBConnecter.parts.add(part);
	}

	public void find(String name) {
		
		int count =0;
		for (int i = 0; i < DBConnecter.parts.size(); i++) {
			if (DBConnecter.parts.get(i).getName().equals(name)) {
				System.out.println(DBConnecter.parts.get(i).getName()+":"+DBConnecter.parts.get(i).getCount());
				count++;
				break;
				
			}
		}
		if(count==0) {System.out.println("찾으시는 물건이 없습니다.");}
		
	}

	public void allSell(Part part) {
		int result = 0;
		for (int i = 0; i < DBConnecter.parts.size(); i++) {
			if (DBConnecter.parts.get(i).getCount() < 1) {
				System.out.println(DBConnecter.parts.get(i).getName() + "의 재고가 부족합니다.");
				break;
			}
			result++;
		}
		if (result == 3) {
			for (int i = 0; i < DBConnecter.parts.size(); i++) {
				DBConnecter.parts.get(i).setCount(DBConnecter.parts.get(i).getCount()-1);

			}
		}
	}

}
