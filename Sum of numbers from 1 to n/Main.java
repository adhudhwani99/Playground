import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      int s=0;
      //int count1 = 1;
         // Run for loop until it reaches the given number
	     for(int count = 1;  count <= n; count = count + 1)
           s=s+ count;
           System.out.println(s);
	}
}