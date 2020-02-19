package com.suntan.investmentservice.mapper;

import com.suntan.investmentservice.domain.PersonDomain;
import com.suntan.investmentservice.model.PersonModel;
import com.suntan.investmentservice.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class PersonDomainModelMapper {

    public PersonModel mapPersonDomainToModel(PersonDomain personDomain) {
        PersonModel personModel = new PersonModel();
        personModel.setPersonId(personDomain.getPersonId());
        personModel.setFirstName(personDomain.getFirstName());
        personModel.setMiddleName(personDomain.getMiddleName());
        personModel.setLastName(personDomain.getLastName());
        personModel.setReferralCode(personDomain.getReferralCode());
        personModel.setEmailId(personDomain.getEmailId());
        personModel.setAlternateEmailId(personDomain.getAlternateEmailId());
        personModel.setMobileNumber(personDomain.getMobileNumber());
        personModel.setAlternateMobileNumber(personDomain.getAlternateMobileNumber());
        personModel.setPanNumber(personDomain.getPanNumber());
        personModel.setAadharNumber(personDomain.getAadharNumber());

        UserModel userModel = new UserModel();
        userModel.setUserId(personDomain.getUserId());
        personModel.setUserModel(userModel);
        return personModel;
    }

    public PersonDomain mapPersonModelToDomain(PersonModel personModel) {
        PersonDomain personDomain = new PersonDomain();
        personDomain.setFirstName(personModel.getFirstName().equals("NULL") ? "" : personModel.getFirstName());
        personDomain.setMiddleName(personModel.getMiddleName().equals("NULL") ? "" : personModel.getMiddleName());
        personDomain.setLastName(personModel.getLastName().equals("NULL") ? "" : personModel.getLastName());
        personDomain.setReferralCode(personModel.getReferralCode().equals("NULL") ? "" : personModel.getReferralCode());
        personDomain.setEmailId(personModel.getEmailId().equals("NULL") ? "" : personModel.getEmailId());
        personDomain.setAlternateEmailId(personModel.getAlternateEmailId().equals("NULL") ? "" : personModel.getAlternateEmailId());
        personDomain.setMobileNumber(personModel.getMobileNumber().equals("NULL") ? "" : personModel.getMobileNumber());
        personDomain.setAlternateMobileNumber(personModel.getAlternateMobileNumber().equals("NULL") ? "" : personModel.getAlternateMobileNumber());
        personDomain.setPanNumber(personModel.getPanNumber().equals("NULL") ? "" : personModel.getPanNumber());
        personDomain.setAadharNumber(personModel.getAadharNumber().equals("NULL") ? "" : personModel.getAadharNumber());
        personDomain.setPersonId(personModel.getPersonId());
        personDomain.setUserId(personModel.getUserModel().getUserId());
        return personDomain;
    }

}
