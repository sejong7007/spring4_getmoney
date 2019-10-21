package com.getmoney.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.serviceimpls.CustomerServiceImpl;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired Map<String , Object> map;
	@Autowired CustomerDTO cus;
	@Autowired CustomerServiceImpl cusService;
		
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody CustomerDTO param) {
		
		logger.info("AJAX가 보낸 아이디와 비번{}",param.getMid() +", "+param.getMpw()+", "+param.getMname());
		
		cus.setMid(param.getMid());
		cus.setMpw(param.getMpw());
		cus.setMname(param.getMname());
		
		cusService.join(cus);
		
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("mid", param.getMid());
		map2.put("mpw", param.getMpw());
		logger.info("map2에 담긴 아이디와 비번 {}",map2.get("mid")+", "+map2.get("mpw"));
		return map2;
	}
	
	@PostMapping("/login")
	public @ResponseBody CustomerDTO login(@RequestBody CustomerDTO param) {
		
		logger.info("로그인 AJAX가 보낸 아이디와 비번{}",param.getMid() +", "+param.getMpw());
		cus.setMid(param.getMid());
		cus.setMpw(param.getMpw());
		logger.info("바티스 가기전 cus에 담긴 사용자 정보 : {}",cus.getMid()+", "+cus.getMpw());
		cus = cusService.login(cus);
		logger.info("바티스 후 cus에 담긴 사용자 정보 : {}",cus.getMid()+", "+cus.getMpw()+", "+cus.getEmail());
		return cus;
	}
	
}
