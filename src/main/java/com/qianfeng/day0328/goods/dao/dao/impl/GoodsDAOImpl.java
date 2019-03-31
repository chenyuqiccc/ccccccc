package com.qianfeng.day0328.goods.dao.dao.impl;

import com.qianfeng.day0328.commons.info.SystemConstantsUtils;
import com.qianfeng.day0328.commons.mybatis.MyBatisSessionFactoryUtils;
import com.qianfeng.day0328.goods.dao.IGoodsDAO;
import com.qianfeng.day0328.goods.entity.Good;
import com.qianfeng.day0328.goods.mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GoodsDAOImpl implements IGoodsDAO{

    @Override
    public List<Good> queryGoodByPage(Integer page) throws Exception {
        GoodsMapper goodsMapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<Good> good = goodsMapper.queryGoodByPage(page, SystemConstantsUtils.Page.PAGE_SIZE);
        return good;
    }

    @Override
    public void insert(Good good) throws Exception {
        SqlSession session = MyBatisSessionFactoryUtils.getSession();
        GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
        goodsMapper.insert(good);
        session.commit();
    }
}
