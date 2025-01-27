package dev.israelld.baseBank.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Historic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long accountNumberOrigin;
	private Long accountNumberDestiny;
	private LocalDateTime historic_data = LocalDateTime.now();
	private HistoricType historicType;
	@ManyToOne
	private Account account;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccountNumberOrigin() {
		return accountNumberOrigin;
	}
	public void setAccountNumberOrigin(Long accountNumberOrigin) {
		this.accountNumberOrigin = accountNumberOrigin;
	}
	public Long getAccountNumberDestiny() {
		return accountNumberDestiny;
	}
	public void setAccountNumberDestiny(Long accountNumberDestiny) {
		this.accountNumberDestiny = accountNumberDestiny;
	}
	public LocalDateTime getHistoric_data() {
		return historic_data;
	}
	public void setHistoric_data(LocalDateTime historic_data) {
		this.historic_data = historic_data;
	}
	public HistoricType getHistoricType() {
		return historicType;
	}
	public void setHistoricType(HistoricType historicType) {
		this.historicType = historicType;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historic other = (Historic) obj;
		return id == other.id;
	}
}
