package week4day1assign;

public class Bankk extends SBI {
	
	
	public void bankBalance() {
		System.out.println("Available bank balance");
	}
	
		
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.cibilscore();
		obj.maximumLoanAmount();
		obj.minimumBalance();
		obj.creditScore();
		
		SBI obj1=new Bankk();
		obj1.ITLoan();
		obj1.bankBalance();
		
		
	}


	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		
	}

}
