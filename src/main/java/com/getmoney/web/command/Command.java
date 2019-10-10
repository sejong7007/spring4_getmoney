package com.getmoney.web.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bran.pool.Constants;

import lombok.Data;

@Data
	public class Command implements Order{
	
	    protected String action, domain, folder, page, view;
	    protected HttpServletRequest request;
	    @Override
	    public void execute() {
	    	System.out.println("command 도착");
	        this.view = String.format(Constants.DOUBLE_PATH,"facade",
	               "main");
	        System.out.println(this.view);
	        
	    }
}