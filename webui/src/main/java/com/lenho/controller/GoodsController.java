package com.lenho.controller;


import com.lenho.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static final String OK = "ok";


    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/queryGoods")
    public String queryGoods(Model model, String name){
        model.addAttribute("goods",goodsService.queryGoodsByName(name));
        return "goods/queryGoods";
    }

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    public String ok() {
        return OK;
    }
}
