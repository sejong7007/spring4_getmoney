package com.getmoney.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data  @Component
public class AdminDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String aid, apw, aname, anum, arank, email, phonenum;

}
