package com.suntan.investmentservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "suntan_investment")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt", "hibernateLazyInitializer", "handler"}, 
        allowGetters = true)
public class InvestmentModel {
	
	@Id
	@GeneratedValue
	@Column(name = "investment_id")
	private Integer investmentId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id")
	private PersonModel person;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "investment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date investmentDate;
	
	@Column(name = "plan")
	private String plan;
	
	@Column(name = "tenure")
	private String tenure;
	
	@Column(name = "outcome")
	private Double outcome;
	
	@Column(name = "status")
	private String status;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	public Integer getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(Integer investmentId) {
		this.investmentId = investmentId;
	}

	public PersonModel getPerson() {
		return person;
	}

	public void setPerson(PersonModel person) {
		this.person = person;
	}

	public Date getInvestmentDate() {
		return investmentDate;
	}

	public void setInvestmentDate(Date investmentDate) {
		this.investmentDate = investmentDate;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
