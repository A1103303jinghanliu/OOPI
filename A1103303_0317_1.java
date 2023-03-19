import java.util.*;

public class A1103303_0317_1{
  public static void main (String [] argv){
    int n;
    int m;
    System.out.print("請輸入n:");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print("請輸入m:");
    m=sc.nextInt();
    
    int [][] secondArray=new int [n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            secondArray[i][j] = (i + 1) * (j + 1);
        }
    }

    int cloumn =0;
    for (int [] row : secondArray) {
        cloumn++;
        for (int value : row) {
            System.out.print( (value/cloumn) + "*" + cloumn + "=" + value + "\t");
        }
        System.out.println();
    }

  }
}