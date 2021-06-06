package com.it.ssm.dao;

import com.it.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellerDao {
    @Select("select * from traveller where id in (SELECT travellerID from ORDER_TRAVELLER where orderId =#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
