
public class Director extends Seller {
	
	public Director() {
		this.savingsAccount = 0;
		this.directSalesAccount=0;
		this.sellers = new Seller[0];
	}

	
	@Override
	public double collectProfits() {
		double cumulativeProfit = 0;
		
		 for(int i = 0; i<sellers.length;i++) {
			 cumulativeProfit = cumulativeProfit+sellers[i].collectProfits();
		 }
		 savingsAccount = savingsAccount +cumulativeProfit +directSalesAccount;
		 directSalesAccount =0;
		 
		 return 0;
	}
}
