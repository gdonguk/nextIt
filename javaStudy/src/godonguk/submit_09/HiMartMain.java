package godonguk.submit_09;

import java.util.ArrayList;

public class HiMartMain {

	public static void main(String[] args) {
		System.out.println("\n========================== 1번 ============================\n");

		ArrayList<Product> all = new ArrayList<>();
		all.add(new Product("냉장고", 2000000));
		all.add(new Product("TV", 1000000));
		all.add(new Product("에어컨", 800000));
		all.add(new Product("컴퓨터", 1300000));
		all.add(new Product("선풍기", 100000));
		
		for (int k = 0; k < all.size() - 1; k++) {
			for (int i = 0; i < all.size() - 1; i++) {
				// i > i + 1 하면 오름차순
				// i < i + 1 하면 내림차순
				if (all.get(i).getPrice() > all.get(i+1).getPrice()) {
					Product t = all.get(i);
					all.set(i, all.get(i+1));
					all.set(i+1, t);
				}
			}
		}
		for(int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i));
		}
		for(int i = 0; i < all.size(); i++) {
			if(all.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		// indexOf()
		// ArrayList<String> ramen = ["신라면", "안성탕면", "진라면"]
		// ArrayList<Integer> number = [10, 20, 30]
		// ramen.indexOf("안성탕면") = 1
		
		// ArrayList<Product> prodList = [Prodeuct객체(냉장고), Product객체(tv));
		// prodList.indexOf("TV") = 
		
		
		
		
		
		
		System.out.println("\n========================== 2번 ============================\n");
		
		
		
	}

}
