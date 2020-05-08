import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p = n;
      int s = 0;
      while ( n > 0)
      {
        int d = n % 10;
        int f = 1;
        for (int i =1 ; i <= d ; i++ )
        f = f * i;
        s = s + f;
        n = n / 10;
      }
      if ( s == p)
        System.out.println ("Yes");
      else 
        System.out.println ("No");
        
	}
}