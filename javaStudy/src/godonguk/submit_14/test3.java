package godonguk.submit_14;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class test3 {
	public static void main(String[] args) {
		String url = "http://lt2.kr/mtest2/module/fetch_info.php?nick=상무알바";
		try {
			Document doc = Jsoup.connect(url).ignoreContentType(true).get();
			String text = doc.body().text();
//			System.out.println(text);
            JSONParser parser = new JSONParser();
            JSONObject obj;
			try {
				obj = (JSONObject) parser.parse(text.toString());
				JSONObject obj_info = (JSONObject) obj.get("info");
				System.out.println("닉네임: " + obj_info.get("nick"));
				System.out.println("어빌리티: " + obj_info.get("Ability"));
				System.out.println("추옵 평균: " + obj_info.get("addoptavr"));
				System.out.println("아이템드랍률: " + obj_info.get("droprate"));
				System.out.println("메소획득량: " + obj_info.get("mesorate"));
				System.out.println("레벨: " + obj_info.get("lvl"));
				System.out.println("직업: " + obj_info.get("job"));
				
				JSONArray arr = (JSONArray) obj.get("option");
				System.out.println(arr.toString());
				for(Object o : arr) {
					JSONObject jsonObj = (JSONObject) o;
					System.out.println(jsonObj.get("add_option"));
				}
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
        
		} catch (IOException e) {
			System.out.println("안됨");
		}
	}
}