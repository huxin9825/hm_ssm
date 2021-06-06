package com.it.ssm.service;

import com.it.ssm.domain.Role;

import java.util.List;

public interface IRoleService {


    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;
}
