import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int p = in.nextInt();
    int f = 1;
    for (int i = 1 ; i <= p ; i++)
    f= f * n;
    System.out.println(f);
  }
}
