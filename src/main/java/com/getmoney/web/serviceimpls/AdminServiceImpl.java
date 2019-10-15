package com.getmoney.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getmoney.web.mappers.AdminMapper;
import com.getmoney.web.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired AdminMapper adminMapper;
	
	
	@Override
	public int countAdmin() {
		return adminMapper.countAdmin();
	}

}
