package com.it.ssm.dao;

import com.it.ssm.domain.Member;
import com.it.ssm.domain.Orders;
import com.it.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrdersDao {
    //查询所有信息
    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one =@One(select = "com.it.ssm.dao.IProductDao.findById"))

    })
    List<Orders> findAll() throws Exception;
    //查询订单详情
    @Select("select * from orders where id =#{ordersId}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one =@One(select = "com.it.ssm.dao.IProductDao.findById")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one =@One(select ="com.it.ssm.dao.IMemberDao.findById")),
            @Result(property = "travellers",column = "id",javaType = java.util.List.class,many = @Many(select = "com.it.ssm.dao.ITravellerDao.findByOrdersId"))
    })
    Orders findById(String ordersId) throws Exception;
}
