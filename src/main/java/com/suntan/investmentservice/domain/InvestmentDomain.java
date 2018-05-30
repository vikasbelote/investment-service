package com.suntan.investmentservice.domain;

import java.util.Date;

public class InvestmentDomain {
	
	private Integer investmentId;
	
	private Integer personId;
	
	private String amount;
	
	private Date investmentDate;
	
	private String plan;
	
	private String tenure;
	
	private Double outcome;
	
	private String status;

	public Integer getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(Integer investmentId) {
		this.investmentId = investmentId;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getInvestmentDate() {
		return investmentDate;
	}

	public void setInvestmentDate(Date investmentDate) {
		this.investmentDate = investmentDate;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public Double getOutcome() {
		return outcome;
	}

	public void setOutcome(Double outcome) {
		this.outcome = outcome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
