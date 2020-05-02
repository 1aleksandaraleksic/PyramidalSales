package anotherWay;

public class MainClass {

	public static void main(String[] args) {
		
		Director d = Director.getInstance();
		
		Seller p1 = new Seller();
		Seller p2 = new Seller();
		Seller p3 = new Seller();
		Seller p4 = new Seller();
		Seller p5 = new Seller();
		
		d.zaposli(p1);
		
		p1.zaposli(p2);
		p1.zaposli(p3);
		
		p2.zaposli(p4);
		p4.zaposli(p5);
		
		p4.prodaj(12000);
		p5.prodaj(2000);
		
		p2.prodaj(6000);
		
		d.prodaj(1300);
		
		d.collectProfits();
		
		System.out.println(d.savingsAccount)  ;
		

	}

}
