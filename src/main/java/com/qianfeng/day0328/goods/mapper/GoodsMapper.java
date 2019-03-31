package com.qianfeng.day0328.goods.mapper;

import com.qianfeng.day0328.goods.entity.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<Good> queryGoodByPage (@Param("index") Integer index , @Param("size") Integer size);
    void insert (Good good);
}
