package entities;

public class BusinessAcount extends Account {
	
	public Double loanLimit;
	
	public BusinessAcount() {
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super();
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= this.loanLimit) {
			this.loanLimit -= amount;
			this.balance += amount;
		}
	}

}
	
	

