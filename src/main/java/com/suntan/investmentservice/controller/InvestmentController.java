package com.suntan.investmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suntan.investmentservice.domain.InvestmentDomain;
import com.suntan.investmentservice.model.InvestmentModel;
import com.suntan.investmentservice.model.PersonModel;
import com.suntan.investmentservice.service.InvestmentService;

@RestController
public class InvestmentController {
	
	@Autowired
	private InvestmentService investmentService;
	
	@GetMapping(value="health-check")
	public String healthCheck() {
		return "Hey, Hi I am inevestservice";
	}
	
	@PostMapping(value = "add-investment")
	public String addInvestment(@RequestBody InvestmentDomain investment) {
		
		investmentService.saveInvestment(investment);
		return "Data saved successfuly " + investment.getAmount();
	}
	
	@GetMapping(value="my-investments")
	public List<InvestmentDomain> myInvestment(@RequestParam("personId")Integer personId) {
		return investmentService.getInvestments(personId);
	}
	
	@GetMapping(value="get-investment")
	public InvestmentDomain getInvestment(@RequestParam("investmentId")Integer investmentId) {
		return investmentService.getInvestment(investmentId);
	}
}
