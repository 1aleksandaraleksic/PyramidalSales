
public class MainClass {

	public static void main(String[] args) {

		Director d = new Director();
		
		Seller p1 = new Seller();
		Seller p2 = new Seller();
		Seller p3 = new Seller();
		Seller p4 = new Seller();
		Seller p5 = new Seller();
		Seller p6 = new Seller();
		Seller p7 = new Seller();
		Seller p8 = new Seller();
		Seller p9 = new Seller();
		Seller p10 = new Seller();
		
		d.hireASaller(p1);
		d.hireASaller(p2);
		d.hireASaller(p3);
		
		p1.hireASaller(p4);
		p1.hireASaller(p5);
		
		p2.hireASaller(p6);
		
		p3.hireASaller(p7);
		
		p4.hireASaller(p8);
		
		p5.hireASaller(p9);
		
		p6.hireASaller(p10);
		
		p3.sale(20000);
	}

}
