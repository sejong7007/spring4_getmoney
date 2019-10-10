package com.web.bran.serviceimpls;


import com.getmoney.web.domains.EmpBean;
import com.web.bran.services.EmpService;


public class EmpServiceImpl implements EmpService {
	private static EmpServiceImpl instance = new EmpServiceImpl();
	public static EmpServiceImpl getInstance() {return instance;}
	private EmpServiceImpl() {}
	
	

	@Override
	public EmpBean login(EmpBean param) {
		
	return null;
	}

	@Override
	public boolean join(EmpBean param) {
		return false;
	}

}
