package com.herb.lib.mybatis.mapper;

import com.herb.lib.dao.dataobject.UserDO;

public interface UserMapper {

    UserDO getByName(String name);

    UserDO getById(Long id);


}
