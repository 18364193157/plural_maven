package com.lenho.service;

import com.lenho.domain.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryGoodsByName(String name);
}
