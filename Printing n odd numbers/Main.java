import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      int count1 = 1;
         // Run for loop until it reaches the given number
	     for(int count = 1;  count1 <= n; count = count + 1)
	     {
	         if(count % 2 == 1)
	         {
	            System.out.println(count); 
               count1 = count1 + 1;
	         }
             // Increase the count by step 1
	         
	     }
	

	}
}