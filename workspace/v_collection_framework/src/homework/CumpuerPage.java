package homework;

import list.task.DBConnecter;

public class CumpuerPage {
	public static void main(String[] args) {
		ComputerShop shop = new ComputerShop();
		Part part = new Part();
		
		shop.addPart(new Part("ram",15000,2));
		
		
		shop.addPart(new Part("ssd",30000,7));
		
	
		shop.addPart(new Part("mainBord",50000,2));
		
		System.out.println(DBConnecter.parts);
		
		shop.find("ssd");
		
		shop.allSell(part);
		System.out.println(DBConnecter.parts);
		shop.find("ssd");
		shop.allSell(part);
		System.out.println(DBConnecter.parts);
		shop.allSell(part);
		
		


		
		
		

	}
}
