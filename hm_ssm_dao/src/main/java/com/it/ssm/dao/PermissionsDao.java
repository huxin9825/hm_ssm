package com.it.ssm.dao;

import com.it.ssm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionsDao {
    @Select("select * from permission where id in(select PermissionId from role_permission where roleId =#{id})")
    List<Permission> findById(String id);

    @Select("select * from Permission")
    List<Permission> findAll();

    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission);
}
