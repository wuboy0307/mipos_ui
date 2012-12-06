package com.mipos.pojos;

import java.io.Serializable;
import java.math.BigDecimal;

public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	BigDecimal balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return getId() + " - " + getName() + " - Balance $" + getBalance().toString();	
	}
	
}
