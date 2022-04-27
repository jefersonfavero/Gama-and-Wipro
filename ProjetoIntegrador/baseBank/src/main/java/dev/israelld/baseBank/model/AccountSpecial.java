package dev.israelld.baseBank.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
//@PrimaryKeyJoinColumn(name="idAccount")
public class AccountSpecial extends Account{
	
	private double limitValue;

	public double getLimitValue() {
		return limitValue;
	}

	public void setLimitValue(double limitValue) {
		this.limitValue = limitValue;
	}
	
}