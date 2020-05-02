
public class Seller {

	public double savingsAccount;
	public double directSalesAccount;
	public Seller [] sellers;
	
	public Seller() {
		this.savingsAccount = 0;
		this.directSalesAccount =0;
		this.sellers = new Seller[0];
	}
	
	public void sale (double sum) {
		this.directSalesAccount = this.directSalesAccount +sum;
	}
	
	public void hireASaller (Seller seller) {
		Seller [] helpSaller = new Seller[sellers.length+1];
		
		for (int i =0; i<sellers.length;i++) {
			helpSaller [i]= sellers[i];
		}
		
		helpSaller[helpSaller.length-1] = seller;
		
		sellers = helpSaller;
	}
	
	public double collectProfits() {
		double cumulativeProfit = 0;
		
		for (int i = 0; i<sellers.length;i++) {
			cumulativeProfit = cumulativeProfit + sellers[i].collectProfits();
		}
		
		cumulativeProfit = cumulativeProfit + directSalesAccount;
		
		directSalesAccount = 0;
		
		savingsAccount = savingsAccount + cumulativeProfit * 0.6;
		
		return cumulativeProfit * 0.4;
	}
}
