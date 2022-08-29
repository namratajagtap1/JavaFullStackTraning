package com.yash.oops_asignment3;

public class Customer_Account_Statement {
	private String CAID;
	private Customer CustId;
	private float amount;
	private int deposit_withdrawl;
	private String deposit_date;
	
	
	public Customer_Account_Statement(String cAID, Customer custId, float amount, int deposit_withdrawl,
			String deposit_date) {
		super();
		CAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public String getCAID() {
		return CAID;
	}

	public void setCAID(String cAID) {
		CAID = cAID;
	}


	public Customer getCustId() {
		return CustId;
	}

	public void setCustId(Customer custId) {
		CustId = custId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(int deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}
	
	
	
}
