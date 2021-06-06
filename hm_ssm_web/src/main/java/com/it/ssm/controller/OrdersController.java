package com.it.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.it.ssm.domain.Orders;
import com.it.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") int page,@RequestParam(name = "size",required = true,defaultValue = "4") int size) throws Exception {

        ModelAndView modelAndView = new ModelAndView();

        List<Orders> ordersList = ordersService.findAll(page,size);

        PageInfo pageInfo = new PageInfo(ordersList);

        modelAndView.addObject("pageInfo",pageInfo);

        modelAndView.setViewName("orders-list");

        return modelAndView;

    }

    @RequestMapping("/findById.do")
    public ModelAndView findBuId(@RequestParam(name = "id",required = true)String ordersId) throws Exception {

        ModelAndView mv = new ModelAndView();

        Orders orders = ordersService.findById(ordersId);

        mv.addObject("orders",orders);
        mv.setViewName("orders-show");
        return mv;
    }
}
