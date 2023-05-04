package godonguk.submit_14;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test2 {
    public static void main(String[] args) {
        String url = "http://lt2.kr/mtest2/module/fetch_info.php?nick=내동님";
        try {
            Document doc = Jsoup.connect(url).ignoreContentType(true).get();
            Elements elements = doc.body().getAllElements();
            for (Element element : elements) {
                if (!element.is("script, style, img")) {
                    System.out.println(element.text());
                }
            }
        } catch (IOException e) {
            System.out.println("안됨");
        }
    }
}