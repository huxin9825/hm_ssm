package com.it.ssm.dao;
import com.it.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {
    //查询所有商品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;
}
