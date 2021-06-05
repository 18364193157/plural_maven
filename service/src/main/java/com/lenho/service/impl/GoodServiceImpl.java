package com.lenho.service.impl;

import com.lenho.domain.Goods;
import com.lenho.mapper.GoodsMapper;
import com.lenho.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodsService {


    @Autowired
    GoodsMapper goodsMapper;

    public List<Goods> queryGoodsByName(String name) {
        if(StringUtils.isEmpty(name)){
            name=null;
        }
        return goodsMapper.getAll(name);
    }
}
