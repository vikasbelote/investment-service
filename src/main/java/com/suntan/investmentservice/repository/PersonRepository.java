package com.suntan.investmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntan.investmentservice.model.PersonModel;

public interface PersonRepository extends JpaRepository<PersonModel, Integer>  {

    PersonModel findByPersonId(Integer personId);

}
