public class Marks{
    public static void main(String args[]){
   
      // create a variable to save marks in maths
      int maths = 94;
   
      // create a variable to save marks in physics
      int phys = 95;
   
      // create a variable to save marks in chemistry
      int chem = 96;
	  
	  //create a variable to calculate average
	  double avg = (double) maths + phys + chem / (double)300 ;
   
      // Print the Sam's marks
      System.out.println("Sam's average marks in PCM is " + avg);
   
    }
  }