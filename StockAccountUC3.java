package bridgelabz.java.practice;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StockAccount  {
	private static void StockAccountUC3() {
		try (PrintWriter writer = new PrintWriter("Data.csv")) {

		      StringBuilder sb = new StringBuilder();
		      sb.append("Id");
		      sb.append(',');
		      sb.append("Name");
		      sb.append(',');
		      sb.append("Number of Shares");
		      sb.append(',');
		      sb.append("Price of Shares");
		      sb.append(',');
		      sb.append("Total value of Stock");
		      sb.append('\n');

		      sb.append("1");
		      sb.append(',');
		      sb.append("TCS");
		      sb.append(',');
		      sb.append("10");
		      sb.append(',');
		      sb.append("100");
		      sb.append(',');
		      sb.append("1000");
		      sb.append('\n');

		      writer.write(sb.toString());

		      System.out.println("Stock information was sucessfully added to the Data file !");

		    } catch (FileNotFoundException e) {
		      System.out.println(e.getMessage());
		    }
		}
	private static void valueOf() {
		return;
	}
	static void buy() {
		try (PrintWriter writer = new PrintWriter("Data.csv")){
		 StringBuilder sb = new StringBuilder();
		  sb.append("Id");
	      sb.append(',');
	      sb.append("Name");
	      sb.append(',');
	      sb.append("Number of Shares");
	      sb.append(',');
	      sb.append("Price of Shares");
	      sb.append(',');
	      sb.append("Total value of Stock");
	      sb.append('\n');
	      
		  sb.append("2");
	      sb.append(',');
	      sb.append("Dell");
	      sb.append(',');
	      sb.append("10");
	      sb.append(',');
	      sb.append("500");
	      sb.append(',');
	      sb.append("5000");
	      sb.append('\n');

	      writer.write(sb.toString());
	      System.out.println(sb);

	      System.out.println("You have successfully buyed the Stock !");

	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	    }
	}
	
	static void sell() {
		try (PrintWriter writer = new PrintWriter("Data.csv")){
		 StringBuilder sb = new StringBuilder();
		  
	      sb.append("2");
	      sb.append(',');
	      sb.append("Dell");
	      sb.append(',');
	      sb.append("10");
	      sb.append(',');
	      sb.append("500");
	      sb.append(',');
	      sb.append("5000");
	      sb.append('\n');
	      System.out.println();
	      System.out.println("Currently you have those stocks : " +sb);
	      
		  sb.delete(0,5000);
		  
	      writer.write(sb.toString());
	     
	      System.out.println("You have successfully selled the Stock !");

	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	    }
	}
	static void save() {
		try (PrintWriter writer = new PrintWriter("Data.csv")){
		 StringBuilder sb = new StringBuilder();
		 sb.append("Id");
	      sb.append(',');
	      sb.append("Name");
	      sb.append(',');
	      sb.append("Number of Shares");
	      sb.append(',');
	      sb.append("Price of Shares");
	      sb.append(',');
	      sb.append("Total value of Stock");
	      sb.append('\n');
	      
	      sb.append("1");
	      sb.append(',');
	      sb.append("TCS");
	      sb.append(',');
	      sb.append("20");
	      sb.append(',');
	      sb.append("100");
	      sb.append(',');
	      sb.append("2000");
	      sb.append('\n');

	      sb.append("2");
	      sb.append(',');
	      sb.append("Dell");
	      sb.append(',');
	      sb.append("10");
	      sb.append(',');
	      sb.append("500");
	      sb.append(',');
	      sb.append("5000");
	      sb.append('\n');
	      
	      sb.append("3");
	      sb.append(',');
	      sb.append("CTS");
	      sb.append(',');
	      sb.append("5");
	      sb.append(',');
	      sb.append("100");
	      sb.append(',');
	      sb.append("500");
	      sb.append('\n');

	      writer.write(sb.toString());
	      System.out.println(sb);

	      System.out.println("You have successfully saved those Stock information !");

	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	    }
	}
	static void print() {
		save();
		 
		
			System.out.println("Also Stock Report has been successfully Displayed ");		
	}
		  
	public static void main(String[] args) {
	
		StockAccountUC3 sa = new StockAccountUC3(); 
		StockAccount();
		buy();
		sell();
		save();
		print();
	}
}
	 
