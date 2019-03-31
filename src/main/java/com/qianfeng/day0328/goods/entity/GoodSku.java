package com.qianfeng.day0328.goods.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodSku {
    private String skuId;
    private String skuName;
    private String skuCost;
    private String skuPrice;
    private String skuPmoney;
    private String goodId;
    private Integer orderNo;
    private String serviceMoney;
    private Good good;
}
