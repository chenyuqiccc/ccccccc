package com.qianfeng.day0328.goods.service.service.impl;

import com.qianfeng.day0328.commons.info.SystemConstantsUtils;
import com.qianfeng.day0328.goods.dao.IGoodsDAO;
import com.qianfeng.day0328.goods.dao.dao.impl.GoodsDAOImpl;
import com.qianfeng.day0328.goods.entity.Good;
import com.qianfeng.day0328.goods.service.IGoodsService;

import java.util.List;

public class GoodsServiceImpl implements IGoodsService{

    private IGoodsDAO goodsDAO = new GoodsDAOImpl();

    @Override
    public List<Good> queryGoodByPage(Integer page) throws Exception {
        if(page < 1){
            throw new IndexOutOfBoundsException("页码最低为1");
        }
        int index = (page-1)* SystemConstantsUtils.Page.PAGE_SIZE;
        List<Good> goods = goodsDAO.queryGoodByPage(index);
        return goods;
    }

    @Override
    public void insert(Good good) throws Exception {
        goodsDAO.insert(good);
    }
}
