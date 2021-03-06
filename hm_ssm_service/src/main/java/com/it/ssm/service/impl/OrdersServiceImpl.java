package com.it.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.it.ssm.dao.IOrdersDao;
import com.it.ssm.domain.Orders;
import com.it.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao iOrdersDao;
    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return iOrdersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {

        return iOrdersDao.findById(ordersId);
    }
}
