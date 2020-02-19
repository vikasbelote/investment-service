package com.suntan.investmentservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class InvestmentDomain {
	
	private Integer investmentId;
	
	private Integer personId;
	
	private Double amount;
	
	private Date investmentDate;

    private LocalDate investmentLocalDate;
	
	private String plan;
	
	private String tenure;
	
	private Double outcome;
	
	private String status;
}
