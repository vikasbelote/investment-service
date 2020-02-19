package com.suntan.investmentservice.service;

import com.suntan.investmentservice.domain.PersonDomain;
import com.suntan.investmentservice.mapper.InvestmentDomainModelMapper;
import com.suntan.investmentservice.mapper.PersonDomainModelMapper;
import com.suntan.investmentservice.model.InvestmentModel;
import com.suntan.investmentservice.model.PersonModel;
import com.suntan.investmentservice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonDomainModelMapper domainModelMapper;

    public void editProfile(PersonDomain personDomain) {
        PersonModel personModel = domainModelMapper.mapPersonDomainToModel(personDomain);
        personRepository.save(personModel);
    }

    public PersonDomain getPersonDetails(Integer personId) {
        PersonModel personModel = personRepository.findByPersonId(personId);
        return domainModelMapper.mapPersonModelToDomain(personModel);
    }
}
