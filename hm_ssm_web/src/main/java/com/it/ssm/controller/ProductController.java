package com.it.ssm.controller;

import com.it.ssm.domain.Product;
import com.it.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {

        ModelAndView modelAndView = new ModelAndView();

        List<Product> ps = productService.findAll();

        modelAndView.addObject("productList",ps);

        modelAndView.setViewName("product-list");
        return modelAndView;
    }
}
