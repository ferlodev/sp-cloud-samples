package com.example.demotransactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	ConfigService configService;
	
	@PostMapping("/save")
	public Result save(Transaction list) {
		Result r = new Result();
		r.setCode(0);
		r.setMessage(configService.getMessage());
		return r;
	}
}
