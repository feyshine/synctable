package com.yeecare.slave.dao;

import com.yeecare.slave.pojo.UserDevice;

public interface UserDeviceMapper {
    int deleteByPrimaryKey(String cId);

    int insert(UserDevice record);

    int insertSelective(UserDevice record);

    UserDevice selectByPrimaryKey(String cId);
    
    UserDevice selectByDeviceId(String deviceId);

    int updateByPrimaryKeySelective(UserDevice record);

    int updateByPrimaryKey(UserDevice record);

	
}