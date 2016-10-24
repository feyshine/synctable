package com.yeecare.slave.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yeecare.slave.dao.DeviceInfoMapper;
import com.yeecare.slave.pojo.DeviceInfo;
import com.yeecare.slave.service.IDeviceInfoService;
@Service("deviceInfoService")
public class DeviceInfoServiceImpl implements IDeviceInfoService {
	
	@Resource
	private DeviceInfoMapper deviceInfoServiceDao;

	public DeviceInfoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int deleteByPrimaryKey(String cId) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.deleteByPrimaryKey(cId);
	}

	@Override
	public int insert(DeviceInfo record) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.insert(record);
	}

	@Override
	public int insertSelective(DeviceInfo record) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.insertSelective(record);
	}

	@Override
	public DeviceInfo selectByPrimaryKey(String cId) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.selectByPrimaryKey(cId);
	}

	@Override
	public int updateByPrimaryKeySelective(DeviceInfo record) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(DeviceInfo record) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.updateByPrimaryKey(record);
	}

	@Override
	public DeviceInfo selectByIeme(String ieme) {
		// TODO Auto-generated method stub
		return deviceInfoServiceDao.selectByIeme(ieme);
	}

}
