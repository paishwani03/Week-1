import java.util.Scanner;

public class Substring {
    
    // Method to create substring using charAt()
    static String createString(String str1, int start, int end) {
		String Substr1="";
        for(int i=start;i<end;i++){
		  Substr1+=str1.charAt(i);
			}
			return Substr1;
    }
	
	// Method to compare two strings using charAt()
    static boolean compareString(String Substr1, String Substr2) {
        if (Substr1.length() != Substr2.length()) {
			System.out.println("Strings of different lengths are not equal");
            return false; 
        }
        
        for (int i = 0; i < Substr1.length(); i++) {
            if (Substr1.charAt(i) != Substr2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter string : ");
        String str1 = sc.next(); 
		
        System.out.print("Enter starting and ending syntax ");
        int start=sc.nextInt();
		int end=sc.nextInt();
		
        // Create substring using charAt()
        String Substr1 = createString(str1, start, end);
		
		//create substring using substring()
		String Substr2=str1.substring(start,end);
        
        // Display results
        System.out.println("Result using charAt() method: " + Substr1);
        System.out.println("Result using substring() method: " + Substr2);

        // Compare both results
        if (compareString(Substr1, Substr2)) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
