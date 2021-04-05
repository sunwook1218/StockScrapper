package com.sun.scrap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        VolumeScrapper vol = new VolumeScrapper();
        boolean b = vol.getList().stream().allMatch(stock -> stock.getCode().length() == 6);
        System.out.println(b);
        vol.getList().stream().forEach(System.out::println);

    }

}
