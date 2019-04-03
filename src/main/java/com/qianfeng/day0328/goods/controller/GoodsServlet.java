package com.qianfeng.day0328.goods.controller;

import com.qianfeng.day0328.goods.entity.Good;
import com.qianfeng.day0328.goods.service.IGoodsService;
import com.qianfeng.day0328.goods.service.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GoodsServlet extends HttpServlet{

    private IGoodsService goodsService = new GoodsServiceImpl();

    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException{
        String pageStr = request.getParameter("page");
        try {
            pageStr = (pageStr == null?"1":pageStr);
            List<Good> goodList =
                    goodsService.queryGoodByPage(Integer.parseInt(pageStr));
            request.setAttribute("goodsList",goodList);
            System.out.println(goodList.size());
            request.getRequestDispatcher("goods_list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
            //能处理就处理
            //不能处理就跳转到错误提示页面
        }
    }
}
