public class Calculate{
    public static void main(String args[]){
   
      // create a variable to save selling price
      int sp = 191;
	  
	  // create a variable to save cost price
      int cp = 129;
	  
	  // create a variable to calculate profit
      int profit = sp-cp;
   
      // create a variable to calculate profit percent
	  double profitPercent= (double)profit  / (double)cp * 100;
	  
	  //Print the output
	  System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp
	  + "\n" + "The Profit is INR " + profit + " " + "the Profit Percentage is " + profitPercent);
   
    }
  }