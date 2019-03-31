package com.qianfeng.day0328;



import com.qianfeng.day0328.goods.entity.Good;
import com.qianfeng.day0328.goods.service.IGoodsService;
import com.qianfeng.day0328.goods.service.service.impl.GoodsServiceImpl;

import java.util.Date;

public class Test {

    public static void main(String [] args){
        //线程1
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                GoodsDAOImpl goodsDAO = new GoodsDAOImpl();
//                try{
//                    List<Good> goods = goodsDAO.queryGoodByPage(0);
//                    goods.get(0).setGoodName("千峰");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//                GoodsDAOImpl goodsDAO1 = new GoodsDAOImpl();
//                try{
//                    List<Good> goods = goodsDAO1.queryGoodByPage(0);
//                    goods.get(0).setGoodName("线程1的二次执行："+goods.get(0).getGoodName());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }

//                //线程2
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        GoodsDAOImpl dao = new GoodsDAOImpl();
//                        try{
//                            List<Good> goods = dao.queryGoodByPage(0);
//                            System.out.println("线程2 :"+goods.get(0).getGoodName());
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }).start();
//            }
//        }).start();


        IGoodsService iGoodsService = new GoodsServiceImpl();
//        GoodsServiceImpl goodsService = new GoodsServiceImpl();
        Good good = new Good();
        good.setGoodId("1");
        good.setGoodName("chen");
        good.setGoodPic("22");
        good.setGoodPic1("33");
        good.setGoodPic2("44");
        good.setPromoteDesc("aa");
        good.setSkuTitle("bb");
        good.setSkuCost("cc");
        good.setSkuPrice("dd");
        good.setSkuPmoney("ee");
        /*good.setCopyIds("ff");
        good.setCopyDesc("gg");*/
        good.setTypeId("hh");
        good.setState(0);
        good.setCreateTime(new Date());
        good.setToped(1);
        good.setRecomed(2);
        try {
            iGoodsService.insert(good);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
