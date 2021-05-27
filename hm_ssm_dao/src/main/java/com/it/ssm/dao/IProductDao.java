package com.it.ssm.dao;
import com.it.ssm.domain.Product;
import java.util.List;

public interface IProductDao {
    //查询所有商品信息
    List<Product> findAll() throws Exception;
}
