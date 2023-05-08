import java.util.*;

class MyselfException extends Exception{
    MyselfException(String a){
        super(a);
    }
}

public class A1103303_0505{
    public static void main(String[] args) throws Exception{
        int l1=39, l2=15, l3=04, l4=19, l5=06, l6=9;

        int x1, x2, x3, x4, x5, x6;
        System.out.print("請輸入六個整數(1~49):");
        Scanner input = new Scanner(System.in);
        x1=input.nextInt();
        x2=input.nextInt();
        x3=input.nextInt();
        x4=input.nextInt();
        x5=input.nextInt();
        x6=input.nextInt();
        try{
            if(x1<1 || x1>49 || x2<1 || x2>49 || x3<1 || x3>49 || x4<1 || x4>49 || x5<1 || x5>49 || x6<1 || x6>49){
                throw new MyselfException("請輸入1~49範圍內之整數！");
            }
            if(l1==x1 && l2==x2 && l3==x3 && l4==x4 && l5==x5 && l6==x6){
                System.out.print("恭喜中獎！");
            }else{
                System.out.println("很遺憾，未中獎:(");
                System.out.print("本次得獎號碼為:39 15 4 19 6 9");
            }
        }catch(MyselfException e){
            System.out.println(e);
        }
    }
}