import java.util.*;

public class A1103303_0224_1{
  public static void main (String [] argv){
    int num;
    System.out.print("請輸入一個整數:");
    Scanner myInput1 = new Scanner(System.in);
    num=myInput1.nextInt();
    System.out.print(num);
    if(num % 2 == 0){
        System.out.println("為偶數");
        }else{
            System.out.println("為奇數");
        }
    
  }
}