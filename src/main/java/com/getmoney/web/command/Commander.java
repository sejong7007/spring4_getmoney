package com.getmoney.web.command;

import javax.servlet.http.HttpServletRequest;

import com.getmoney.web.enums.Action;

public class Commander {
	  public static Command direct(HttpServletRequest request) {
	      System.out.println("commander �룄李�");  
		  
		    Command cmd = null;
	        System.out.println("commander : "+request.getParameter("action"));
	        switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
	        
	        case LOGIN : cmd = null; break;
	        case CREATE : cmd = null; break;
	        case MOVE : cmd = null; break;
	        }
	        return cmd;
	    }

}
