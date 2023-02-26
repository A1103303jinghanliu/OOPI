import java.util.*;

public class A1103303_0224_2{
  public static void main (String [] argv){
    int degreesC, degreesF;
    System.out.print("請輸入代表攝氏溫度的值:");
    Scanner myInput1 = new Scanner(System.in);
    degreesC=myInput1.nextInt();
    
    degreesF = degreesC*9/5+32;
    System.out.print("此攝氏溫度轉換成華氏溫度為:"+degreesF);
    
  }
}    