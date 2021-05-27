package com.it.ssm.service;

import com.it.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
