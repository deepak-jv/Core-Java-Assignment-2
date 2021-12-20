package corejava_assignment_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Currency{
	int amount;
	
	private void conversion(){
		
		System.out.println("currency conversion");
	
	}
	
}

class Rupee extends Currency{
	
	
	
	public Rupee(int rs) {
		this.amount = rs;
	}
	
	public double rs_to_dollar(){
		return amount*0.013;
	}
	public double rs_to_euro(){
		return amount*0.012;
	}
	
}

class Dollar extends Currency{
	
	
	public Dollar(int dl) {
		this.amount = dl;

		
	}
	
	public double dollar_to_rs(){
		
		
		return amount*74.94;
	}
	public double dollar_to_euro(){
		
		
		return amount*0.88;
	}
	
	
}

class Euro extends Currency{
	
	
	public Euro(int eu) {
		
		this.amount = eu;
	}
	
	public  double euro_to_rs(){
			return amount*84.68;
	}
	public  double euro_to_dollar(){
		return amount*1.13;
	}
	
}


class CalculateCurrency extends Currency{

			private String convertForm;
			private String convertTo;

			public CalculateCurrency(String convert, String to, int amt) {
				
				this.convertForm = convert;
				this.convertTo = to;
				this.amount = amt;
				Rupee rs = new Rupee(this.amount);
				Euro eu = new Euro(this.amount);
				Dollar d = new Dollar(this.amount);
				
				String r1 ="Rupee";
				String e1 = "Euro";
				String d1 = "Dollar";
				
				if (convertForm.equals(r1) && convertTo.equals(d1)){
					
				System.out.println("conversion of "+ this.amount+"rs---- "+ " to "+ rs.rs_to_dollar()+"amount in dollar");
				}
				else if (convertForm.equals(d1) && convertTo.equals(r1) ) {
					
					System.out.println("conversion of "+this.amount+"$---- "+ " to "+ d.dollar_to_rs()+"rs");
				}
				else if (convertForm.equals(e1) && convertTo.equals(d1) ) {
					
					System.out.println("conversion of "+this.amount+"eu----"+ " to "+eu.euro_to_dollar()+"$");
				}
				else if (convertForm.equals(e1) && convertTo.equals(r1) ) {
					
					System.out.println("conversion of "+this.amount+"eu---- "+ " to "+ eu.euro_to_rs()+"rs");
				}
				else if (convertForm.equals(rs) && convertTo.equals(e1)) {
					
					System.out.println("conversion of "+this.amount+"rs---- "+ " to "+ rs.rs_to_euro()+"euro");
				}
				else if (convertForm.equals(d1) && convertTo.equals(e1)) {
					
					System.out.println("conversion of "+this.amount+"$----- "+ " to "+ d.dollar_to_euro()+"euro");
				}
				else {
					System.out.println("something went wrong");
						
					}
							
				
				
			}
			
		
			}



public class CurrencyAssignment {


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String r1 ="Rupee";
		String e1 = "Euro";
		String d1 = "Dollar"; 
		List r2 = new ArrayList();
		List e2 = new ArrayList();
		List d2 = new ArrayList();
		
		
		while(true) {
		
		System.out.println("Convert From: enter Dollar/Rupee/Euro");
		String from = sc.next();
		
		System.out.println("Convert to: enter Dollar/Rupee/Euro");
		String to = sc.next();
		
		System.out.println("Enter the Amount:");
		int amt = sc.nextInt();
		
		
		
		if (from.equals(r1)) {
			
			r2.add(amt);
			
		}
		if (from.equals(e1)) {
			
			e2.add(amt);
			
		}
		if (from.equals(d1)) {
			
			d2.add(amt);
			
		}
		CalculateCurrency c = new CalculateCurrency(from, to, amt);
		System.out.println("Do you want to add amount: yes|no (case sensitive)");
		
		String opn = sc.next();
		String y = "yes";
		
		

		
		if(opn.equals(y)) {
			
				continue;
		
		}
		
		
		else {
			
			break;
			
		}

	
		}
		
		
		int r = 0;
		int e = 0;
		int d = 0;
		
		for(int i = 0; i < r2.size();i++) {
			
			r +=(int) r2.get(i);
		}
		for(int i = 0; i < e2.size();i++) {
			
			e +=(int) e2.get(i);
		}
		for(int i = 0; i < d2.size();i++) {
			
			d +=(int) d2.get(i);
		}
		
		System.out.println("total amount added in rupee is = "+r);
		System.out.println("total amount added in euro is = "+e);
		System.out.println("total amount added dollar is = "+d);
		
		
		
		
		
	}

}



