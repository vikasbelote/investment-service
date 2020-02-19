package com.suntan.investmentservice.mapper;

import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.suntan.investmentservice.domain.InvestmentDomain;
import com.suntan.investmentservice.model.InvestmentModel;
import com.suntan.investmentservice.model.PersonModel;

@Component
public class InvestmentDomainModelMapper {
	
	public InvestmentModel mapInvestmentDomainToModel(InvestmentDomain investmentDomain) {
		InvestmentModel investmentModel = new InvestmentModel();
		investmentModel.setAmount(investmentDomain.getAmount());
		investmentModel.setPlan(investmentDomain.getPlan());
		investmentModel.setTenure(investmentDomain.getTenure());
		investmentModel.setInvestmentDate(investmentDomain.getInvestmentDate());
		investmentModel.setInvestmentId(investmentDomain.getInvestmentId());
		investmentModel.setOutcome(investmentDomain.getOutcome());
		investmentModel.setStatus(investmentDomain.getStatus());
		
		PersonModel person = new PersonModel();
		person.setPersonId(investmentDomain.getPersonId());
		investmentModel.setPerson(person);
		
		return investmentModel;
	}
	
	public InvestmentDomain mapInvestmentModelToDomain(InvestmentModel investmentModel) {
		InvestmentDomain investmentDomain = new InvestmentDomain();
		investmentDomain.setAmount(investmentModel.getAmount());
		investmentDomain.setPlan(investmentModel.getPlan());
		investmentDomain.setTenure(investmentModel.getTenure());
		investmentDomain.setInvestmentDate(investmentModel.getInvestmentDate());
		investmentDomain.setInvestmentLocalDate(investmentModel.getInvestmentDate()
				.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate());
		investmentDomain.setInvestmentId(investmentModel.getInvestmentId());
		investmentDomain.setOutcome(investmentModel.getOutcome());
		investmentDomain.setStatus(investmentModel.getStatus());
		investmentDomain.setPersonId(investmentModel.getPerson().getPersonId());
		return investmentDomain;
	}
	
	
	public List<InvestmentDomain> mapInvestmentModelToDomainList(List<InvestmentModel> investmentModels) {
		List<InvestmentDomain> investmentDomains = investmentModels.stream()
				.map(investmentModel -> mapInvestmentModelToDomain(investmentModel)).
				collect(Collectors.toList());
		return investmentDomains;
	}
}
