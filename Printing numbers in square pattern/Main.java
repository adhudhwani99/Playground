import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		//Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      //int c = 1;
      for (int i = 1 ; i <= n ; i++)
      {
        for (int j = 1; j <= n ; j++)
          System.out.print(i);
          System.out.println();
        }
          
	}
}