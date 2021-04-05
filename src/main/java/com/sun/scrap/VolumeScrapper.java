package com.sun.scrap;

import com.sun.scrap.vo.Stock;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VolumeScrapper implements Scrapper {

    private static String url = "https://finance.naver.com/sise/sise_quant.nhn";

    @Override
    public Document scrap() {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    @Override
    public List<Stock> getList() {

        List<Stock> data = new ArrayList<>();
        Document document = scrap();

        Elements elements = document.select(".type_2 a");

        int idx = 0;

        for (Element element : elements) {
            idx++;
            if (idx > 30) {
                break;
            }
            Stock stock = new Stock(element.html(), element.attr("href").substring(20), "");
            data.add(stock);
        }

        return data;
    }
}
