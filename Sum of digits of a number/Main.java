import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int s = 0; 
   //int is_prime = 1; 
   //int a=n % 10;
   //int first= n;
      while(n!=0)
    {
        int first = n % 10;
        s= s + first;
        n= n/10;
    }
      System.out.println(s);
	}
}