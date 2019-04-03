package com.qianfeng.day0328.goods.dao;

import com.qianfeng.day0328.goods.entity.Good;

import java.util.List;

public interface IGoodsDAO {
    List<Good> queryGoodByPage(Integer page) throws Exception;
    void insert(Good good)throws Exception;
    void delete (String goodId)throws Exception;
    List <Good> finAll() throws Exception;
}
