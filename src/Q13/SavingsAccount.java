package Q13;

class Account{
	public Account(){
		
	}
	public Account(double b){
		//
	}
}

public class SavingsAccount extends Account {
	
	double rate = 0.02;
	SavingsAccount(double startingBalance) {
		super(startingBalance);
	}
	@Override
	public String toString() {
		
	return String.format("Savings Current Balance: $%.2f", this.getBalance());
	}
}
