package com.it.ssm.dao;

import com.it.ssm.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = List.class,many = @Many(select = "com.it.ssm.dao.PermissionsDao.findById")),
    })
    List<Role> findRoleByUserId(String userId);

    @Select("select * from role")
    List<Role> findAll() throws Exception;

    @Insert("insert into role(rolename,roledesc) values(#{roleName},#{roleDesc})")
    void save(Role role) throws Exception;
}
