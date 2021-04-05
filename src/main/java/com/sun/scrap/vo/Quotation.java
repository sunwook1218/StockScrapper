package com.sun.scrap.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Data
public class Quotation {

    private Timestamp date;
    private BigDecimal cq;
    private BigDecimal var;
    private BigDecimal oq;
    private BigDecimal hq;
    private BigDecimal lq;
    private BigDecimal tv;

}
