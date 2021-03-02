package com.octest.banque.bean;

import java.util.Date;

public class TransactionBean {
	
	// transaction id
	private long trasactionId;
	// date transaction
	private Date trasactionDate;
	//type transaction
	private String transactionType;
	//montant de la transaction
	private double transactionAmount;
	//description
	private String description;
	//
	private long toAccountNo;
	private long fromAccountNo;
	

	public long getTrasactionId() {
		return trasactionId;
	}

	public void setTrasactionId(long trasactionId) {
		this.trasactionId = trasactionId;
	}

	public Date getTrasactionDate() {
		return trasactionDate;
	}

	public void setTrasactionDate(Date trasactionDate) {
		this.trasactionDate = trasactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getToAccountNo() {
		return toAccountNo;
	}

	public void setToAccountNo(long toAccountNo) {
		this.toAccountNo = toAccountNo;
	}

	public long getFromAccountNo() {
		return fromAccountNo;
	}

	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}

}