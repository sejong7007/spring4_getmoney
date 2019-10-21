package com.getmoney.web.mappers;

import org.springframework.stereotype.Repository;

import com.getmoney.web.domains.CustomerDTO;

@Repository
public interface CustomerMapper {
	
	public CustomerDTO selectByIdPw(CustomerDTO param);
	
	public void insertIntoCusData(CustomerDTO param);
	
}
