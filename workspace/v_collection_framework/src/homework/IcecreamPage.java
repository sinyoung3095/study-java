package homework;

import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class IcecreamPage {
public static void main(String[] args) {
	Icecream[] ice = {
			new Icecream("블랙 소르베", 3000, new String[]{"단맛","신맛","레몬맛"}),
			new Icecream("사랑에 빠진 딸기", 4000 , new String[] {"단맛","딸기맛"}),
			new Icecream("엄마는 외계인", 2000 , new String[] {"단맛","초콜렛"}),
			new Icecream("이상한 나라의 솜사탕", 3500 , new String[] {"단맛","솜사탕"})
	};
	Baskin baskin = new Baskin();
	ArrayList<Icecream> ices = new ArrayList<Icecream>(Arrays.asList(ice));
	ices.forEach((data)->baskin.recommend("단맛"));
//	System.out.println(ices.get(0).getTaste());
//	ices.stream().filter((data)->data.getPrice()==2000).forEach(System.out::print);
//	baskin.addIce(new Icecream("블랙소르베",3000,new String[]{"단맛","신맛"}));
	
//	baskin.recommend(new String[] {"단맛"});
	
}
}
