package com.deitel.ch17;

import java.io.Serializable;

public class AccountRecordSerializable implements Serializable {
	
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	private Integer[] arry;
	
	public AccountRecordSerializable () {
		this( 0, "", "", 0.0);
	}
	public AccountRecordSerializable  (
			int acct, String first, String last, double bal) {
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);
		arry = new Integer[3];
		arry[0] = 21;
		arry[1] = 19;
		arry[2] = 75;
	}
	public String getArry() {
		return "Array " + arry[0] + " " + arry[1] + " " + arry[2];
	}
	public void setAccount(int acc){
		account = acc;
	}
	public int getAccount() {
		return account;
	}
	public void setFirstName(String first){
		firstName = first;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String last){
		lastName = last;
	}
	public String getLastName() {
		return lastName;
	}	
	public void setBalance(double bal){
		balance = bal;
	}
	public double getBalance(){
		return balance;
	}
	
	
	
}
