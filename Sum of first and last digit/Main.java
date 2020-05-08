import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   //int num = 2; 
   //int is_prime = 1; 
   int a=n % 10;
   int first= n;
      while(first >= 10)
    {
        first = first / 10;
    }
   //int b=n / 10000;
   int sum=a + first;
      System.out.println(sum);
	}
}