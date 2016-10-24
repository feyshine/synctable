package com.yeecare.slave.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yeecare.slave.dao.UserDeviceMapper;
import com.yeecare.slave.pojo.UserDevice;
import com.yeecare.slave.service.IUserDevice;
@Service("userDeviceService")
public class UserDeviceImpl implements IUserDevice{

	@Resource
	private UserDeviceMapper userDeviceDao;
	
	public UserDeviceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int deleteByPrimaryKey(String cId) {
		// TODO Auto-generated method stub
		return userDeviceDao.deleteByPrimaryKey(cId);
	}

	@Override
	public int insert(UserDevice record) {
		// TODO Auto-generated method stub
		return userDeviceDao.insert(record);
	}

	@Override
	public int insertSelective(UserDevice record) {
		// TODO Auto-generated method stub
		return userDeviceDao.insertSelective(record);
	}

	@Override
	public UserDevice selectByPrimaryKey(String cId) {
		// TODO Auto-generated method stub
		return userDeviceDao.selectByPrimaryKey(cId);
	}

	@Override
	public int updateByPrimaryKeySelective(UserDevice record) {
		// TODO Auto-generated method stub
		return userDeviceDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserDevice record) {
		// TODO Auto-generated method stub
		return userDeviceDao.updateByPrimaryKey(record);
	}

	@Override
	public UserDevice selectByDeviceId(String deviceId) {
		// TODO Auto-generated method stub
		return userDeviceDao.selectByDeviceId(deviceId);
	}

}
