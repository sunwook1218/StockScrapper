package com.sun.scrap;

import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public interface Scrapper {

    Document scrap() throws IOException;
    List getList();

}
