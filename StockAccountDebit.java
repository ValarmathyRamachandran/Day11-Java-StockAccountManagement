package bridgelabz.java.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountDebit{
	
	private static int readprice;
	private int readno;
	int a=0;
	double totalValue;
	
	public static void main(String args[]) {
		double calStock1 = 0;
		int n=0;
		String readname = null;
		int readno = 0;
		double readprice = 0;
		double totalValue = 0;
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Please enter Number of Stocks:");
		n=scan.nextInt();
		
		for(int i = 0; i < n; i++)  {
			
			
		System.out.println("Please enter Stock Names:");
		readname = scan.next();
		System.out.println("Please enter number of Shares:");
		readno = scan.nextInt();
		System.out.println("Please enter Share Price in rupees:");
		readprice = scan.nextDouble();
		
		calStock1 = readno * readprice;
		
		System.out.println(":::::::::Stock Report:::::::::");
		System.out.println("Stock Name = " +readname.toUpperCase());
		System.out.println("Number of Shares = " +readno);
		System.out.println("Share Price = " +" Rs."+readprice +" (per each stock) ");
		System.out.println("Total value of Stock for "+readname.toUpperCase() + " = " +" Rs." +calStock1);
		
		totalValue = totalValue + calStock1;
		System.out.println("::::::Total Value of Stocks:::::" +totalValue);
		System.out.println(":::::::::::End of Report:::::::::::::" );
		System.out.println(" Total Account Balance = " +totalValue);
		
		StockAccountDebit objStockAccount = new StockAccountDebit();
		objStockAccount.debit(totalValue);

		}
		
	}
	public void debit(double totalValue){
		System.out.println("Please Enter the amount to WithDraw from your account?");
		Scanner scan  = new Scanner(System.in);
		a=scan.nextInt();
		
		if(a > totalValue) {
			System.out.println("Sorry,Debit amount exceeded account balance");
		}
		else {
			double balance = totalValue - a; 
			System.out.println("Balance in your Acount after Withdrawl amount = " +balance);
				
			}
	}
}
