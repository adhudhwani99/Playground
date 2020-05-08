import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	     Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int max = 0;
      int n;
      if (a>b && a>c)
        n = a;//System.out.print(a);
      else if (b>a && b>c)
        n = b;//System.out.print(b);
      else
        n = c;//System.out.print(c);
      for (int i = 1 ; i<=n ; i++)
      {
        if (a % i == 0 && b % i == 0 && c % i == 0 && max< i)
          max =i;
      }
      System.out.print(max);
	}
}