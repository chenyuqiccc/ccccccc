package com.qianfeng.day0328.goods.service;

import com.qianfeng.day0328.goods.entity.Good;

import java.util.List;

public interface IGoodsService {
    List<Good> queryGoodByPage(Integer page)throws Exception;
    void insert (Good good)throws Exception;
}
