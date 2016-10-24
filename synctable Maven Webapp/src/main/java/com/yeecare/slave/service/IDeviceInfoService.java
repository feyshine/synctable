package com.yeecare.slave.service;

import com.yeecare.slave.pojo.DeviceInfo;

public interface IDeviceInfoService {
	
	int deleteByPrimaryKey(String cId);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    DeviceInfo selectByPrimaryKey(String cId);
    
    DeviceInfo selectByIeme(String ieme);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);
    
    

}
