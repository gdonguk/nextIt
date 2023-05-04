package godonguk.submit_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class test4 {

	public static void main(String[] args) {
		String url = "http://lt2.kr/mtest2/module/fetch_info.php?nick=내동님";
		try {
			URL call_url = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) call_url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			if(connection.getResponseCode() != 200) {
				throw new RuntimeException("failed" + connection.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder result = new StringBuilder();
			String line;
			while((line = br.readLine()) != null) {
				result.append(line);
			
			}
			// JSONParser 를 이용해 파싱
			System.out.println("JSON response:" + result.toString());
//			JSONParser parser = new JSONParser();
//			try {
//				JSONArray arr = (JSONArray) parser.parse(result.toString());
//				System.out.println("JsonArray:" + arr.toJSONString());
//				System.out.println(arr.get(1));
//				for(Object obj : arr) {
//					JSONObject jsonObj = (JSONObject) obj;
//					System.out.println(jsonObj.get("item_class"));
//				}
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
			
			
			
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
