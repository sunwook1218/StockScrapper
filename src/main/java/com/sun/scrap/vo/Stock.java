package com.sun.scrap.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Data
public class Stock {

    private String name;
    private String code;
    private String market;

}

