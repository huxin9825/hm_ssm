package com.it.ssm.service.impl;

import com.it.ssm.dao.PermissionsDao;
import com.it.ssm.domain.Permission;
import com.it.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private PermissionsDao permissionsDao;
    @Override
    public List<Permission> findAll() {
        return permissionsDao.findAll();
    }

    @Override
    public void save(Permission permission) {
        permissionsDao.save(permission);
    }
}
