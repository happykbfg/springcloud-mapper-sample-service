package com.kb.bfd.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kb.bfd.sample.dao.SampleUserDao;
import com.kb.bfd.sample.model.SampleUser;


@Service
public class SampleUserServiceImpl implements SampleUserService{

	@Autowired
	private SampleUserDao sampleUserDao;
	
	@Override
	public List<SampleUser> selectUser() throws Exception {
		// TODO Auto-generated method stub
		return sampleUserDao.selectUser();
	}

}
