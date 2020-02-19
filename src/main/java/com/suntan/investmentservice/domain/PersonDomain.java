package com.suntan.investmentservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.suntan.investmentservice.model.UserModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PersonDomain {

    private Integer personId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String referralCode;
    private String emailId;
    private String alternateEmailId;
    private String mobileNumber;
    private String alternateMobileNumber;
    private String panNumber;
    private String aadharNumber;
    private Integer userId;

}
