package streamTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductPage {
public static void main(String[] args) {
	Product[] product = {
			new Product("자전거",80000,3),
			new Product("보드",40000,5),
			new Product("인라인스케이트",50000,7)
	};
	
	ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(product));
	products.forEach((data)->{System.out.println(data.getPrice()*0.7);});
//	products.stream().map((data)->data.getCount()).map((data)->10).forEach((data)->{System.out.println(10); });
//	System.out.println( products.get(0).getCount());
//	products.stream().map((data)->data.getPrice()*data.getCount()).forEach(System.out::println);
}
}
