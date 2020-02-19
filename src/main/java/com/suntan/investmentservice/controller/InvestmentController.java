package com.suntan.investmentservice.controller;

import com.suntan.investmentservice.domain.InvestmentDomain;
import com.suntan.investmentservice.domain.PersonDomain;
import com.suntan.investmentservice.service.InvestmentService;
import com.suntan.investmentservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class InvestmentController {
	
	@Autowired
	private InvestmentService investmentService;

	@Autowired
	private ProfileService profileService;

	@GetMapping(value="health-check")
	public String healthCheck() {
		return "Hey, Hi I am investment service";
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

	@GetMapping(value="my-profile")
	public PersonDomain myProfile(@RequestParam("personId")Integer personId) {
		return profileService.getPersonDetails(personId);
	}

    @GetMapping(value="getDashboardContent")
    public List<InvestmentDomain> getDashboardContent(@RequestParam("personId")Integer personId) {
        return investmentService.getDashboardContent(personId);
    }

	@GetMapping(value="get-investment")
	public InvestmentDomain getInvestment(@RequestParam("investmentId")Integer investmentId) {
		return investmentService.getInvestment(investmentId);
	}

	@PostMapping(value = "edit-profile")
	public String editProfile(@RequestBody PersonDomain personDomain) {
		profileService.editProfile(personDomain);
		return "Data saved successfuly for " + personDomain.getFirstName();
	}
}
