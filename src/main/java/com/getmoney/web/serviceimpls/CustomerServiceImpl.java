package com.getmoney.web.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.mappers.CustomerMapper;
import com.getmoney.web.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerMapper cusMapper;
	
	@Override
	public CustomerDTO login(CustomerDTO param) {
		return cusMapper.selectByIdPw(param);
	}

	@Override
	public void join(CustomerDTO param) {
		cusMapper.insertIntoCusData(param);		
	}

}
