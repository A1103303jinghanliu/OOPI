import java.util.*;

public class A1103303_0421_1{
    public static void main (String [] argv){
        String x;
        System.out.print("請輸入電子郵件信箱(小寫):");
        Scanner input = new Scanner(System.in);
        x=input.nextLine();
        //System.out.println(x.matches("[a-z0-9]*[@]{1}[m]{1}[a]{1}[i]{1}[l]{1}[.]{1}[c]{1}[o]{1}[m]{1}"));
        if(x.matches("[a-z0-9]*[@]{1}[m]{1}[a]{1}[i]{1}[l]{1}[.]{1}[c]{1}[o]{1}[m]{1}") == true){
            System.out.println("輸入格式正確");
        }else{
            System.out.println("輸入格式錯誤");
        }
    }
}