package godonguk.submit_14;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class test3 {
    public static void main(String[] args) {
        String url = "http://lt2.kr/mtest2/module/fetch_info.php?nick=내동님";
        try {
            Document doc = Jsoup.connect(url).ignoreContentType(true).get();
            String text = doc.body().text();
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("안됨");
        }
    }
}