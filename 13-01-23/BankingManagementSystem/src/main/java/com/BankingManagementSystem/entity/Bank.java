package com.BankingManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cusId;
	
	@Column(length = 10, nullable = false, unique = true)
	private long accountNo;
	
	@Column(length = 20, nullable = false)
	private String custName;
	
	@Column(length = 20, nullable = false)
	private String custAdd;
	
	@Column(length = 10, nullable = false, unique = true)
	private long phone;
	
	@Column(length = 4, nullable = false)
	private int accPin;

	public int getCusId() {
		return cusId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public long getPhone() {
		return phone;
	}

	public int getAccPin() {
		return accPin;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setAccPin(int accPin) {
		this.accPin = accPin;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}