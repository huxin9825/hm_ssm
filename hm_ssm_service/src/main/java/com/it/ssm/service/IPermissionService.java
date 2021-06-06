package com.it.ssm.service;

import com.it.ssm.domain.Permission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll();

    void save(Permission permission);
}
