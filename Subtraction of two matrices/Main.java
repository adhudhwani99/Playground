import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrixA[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrixA[i][j] = in.nextInt();
      }
    }
    int matrixB[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrixB[i][j] = in.nextInt();
      }
    }
    int transpose[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        transpose[i][j] = matrixA[i][j]- matrixB[i][j]; 
      }
    }
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}