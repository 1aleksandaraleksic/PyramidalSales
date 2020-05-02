package anotherWay;

import java.util.ArrayList;

public class Seller {
	
	double savingsAccount;
	double directSalesAccount;
	
	ArrayList<Seller> sellers;
	
	public Seller () {
		sellers = new ArrayList<Seller>();
	}
	
	public Seller (long savingsAccount, long directSalesAccount) {
		this.savingsAccount = savingsAccount;
		this.directSalesAccount = directSalesAccount;
		sellers = new ArrayList<Seller>();
	}
	
	public void prodaj(int sum) {
		this.directSalesAccount += sum;
	}
	
	public void zaposli (Seller seller) {
		sellers.add(seller);
	}
	
	public double collectProfits() {
		double cumulativeProfit = 0;
		
		for(Seller p: sellers) {
			cumulativeProfit +=  p.collectProfits();
		}
		
		cumulativeProfit += this.directSalesAccount;
		
		this.directSalesAccount = 0;
		
		this.savingsAccount = cumulativeProfit * 0.6;	
		
		return  cumulativeProfit * 0.4;
	}

}
