package com.suntan.investmentservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntan.investmentservice.domain.InvestmentDomain;
import com.suntan.investmentservice.mapper.InvestmentDomainModelMapper;
import com.suntan.investmentservice.model.InvestmentModel;
import com.suntan.investmentservice.model.PersonModel;
import com.suntan.investmentservice.repository.InvestmentRepository;

@Service
public class InvestmentService {
	
	@Autowired
	private InvestmentRepository investmentRepository;
	
	@Autowired
	private InvestmentDomainModelMapper domainModelMapper;
	
	public void saveInvestment(InvestmentDomain investmentDomain) {
		InvestmentModel investmentModel = domainModelMapper.mapInvestmentDomainToModel(investmentDomain);
		investmentModel.setInvestmentDate(new Date());
		investmentRepository.save(investmentModel);
	}
	
	public List<InvestmentDomain> getInvestments(Integer personId) {
		PersonModel personModel = new PersonModel();
		personModel.setPersonId(personId);
		List<InvestmentModel> investmentModels = investmentRepository.findByPerson(personModel);
		return domainModelMapper.mapInvestmentModelToDomainList(investmentModels);
	}
	
	public InvestmentDomain getInvestment(Integer investmentId) {
		InvestmentModel investmentModel = investmentRepository.findByInvestmentId(investmentId);
		return domainModelMapper.mapInvestmentModelToDomain(investmentModel);
	}
}
