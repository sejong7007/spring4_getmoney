package com.getmoney.web.daos;

import com.getmoney.web.domains.EmpBean;

public interface EmpDao {
	
	public boolean insertEmpBean(EmpBean param);
	
	public EmpBean selectbyLoginData(EmpBean param);
	
	
}
