package anotherWay;

public class Director extends Seller{
	
	private static Director instance;
	
	private Director() {
		
	}
	
	public static Director getInstance() {
		if(instance == null) {
			instance = new Director();
		}
		return instance;
	}
	
	@Override
	public double collectProfits() {
		double cumulativeProfit = 0;
		
		for(Seller p: sellers) {
			cumulativeProfit += p.collectProfits();
		}
		
		savingsAccount = savingsAccount + cumulativeProfit + directSalesAccount;
		directSalesAccount =0;
		return 0;
	}

}
