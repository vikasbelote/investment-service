package com.suntan.investmentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntan.investmentservice.model.InvestmentModel;
import com.suntan.investmentservice.model.PersonModel;

public interface InvestmentRepository extends JpaRepository<InvestmentModel, Integer>  {
	
	List<InvestmentModel> findByPerson(PersonModel person);
	
	InvestmentModel findByInvestmentId(Integer investmentId);
}
