package com.qianfeng.day0328.goods.controller;

import com.qianfeng.day0328.goods.entity.Good;
import com.qianfeng.day0328.goods.service.IGoodsService;
import com.qianfeng.day0328.goods.service.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoodInsertServlet extends HttpServlet{

    private IGoodsService goodsService = new GoodsServiceImpl();

    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException {
        String goodId = request.getParameter("goodId");
        String goodName = request.getParameter("goodName");
        String goodPic = request.getParameter("goodPic");
        String goodPic1 = request.getParameter("goodPic1");
        String goodPic2 = request.getParameter("goodPic2");
        String promoteDesc = request.getParameter("promoteDesc");
        String skuTitle = request.getParameter("skuTitle");
        String skuCost = request.getParameter("skuCost");
        String skuPrice = request.getParameter("skuPrice");
        String skuPmoney = request.getParameter("skuPmoney");
        String typeId = request.getParameter("typeId");
        String state = request.getParameter("state");
        String createTime = request.getParameter("createTime");
        String toped= request.getParameter("toped");
        String recomed = request.getParameter("recomed");
//        Good good = new Good(goodId,goodName,goodPic);
    }
}
