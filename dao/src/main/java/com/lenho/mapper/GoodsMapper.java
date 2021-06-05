package com.lenho.mapper;

import com.lenho.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface GoodsMapper {


    /**获得所有商品*/
    List<Goods> getAll(@Param("name") String name);
}
