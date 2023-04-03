import java.util.*;

public class A1103303_0331_1{
    public static void main (String [] argv)throws Exception{
        A1103303_0331_animal.showinfo();

        A1103303_0331_animal animal1=new A1103303_0331_animal("雪寶", 1.1, 52, 100);
        animal1.show();
        double x;
        double y;
        System.out.print("請輸入"+animal1.name+"奔跑的時間(分鐘):");
        Scanner input = new Scanner(System.in);
        x=input.nextDouble();
        System.out.print("請輸入"+animal1.name+"的加速度:");
        y=input.nextDouble();
        if(y!=0){
            System.out.println(animal1.name+"奔跑的距離:"+animal1.distance(x, y));
        }else {
            System.out.println(animal1.name+"奔跑的距離:"+animal1.distance(x));
        }

        A1103303_0331_animal animal2=new A1103303_0331_animal("驢子", 1.5, 99, 200);
        animal2.show();
        double x1;
        double y1;
        System.out.print("請輸入"+animal2.name+"奔跑的時間(分鐘):");
        x1=input.nextDouble();
        System.out.print("請輸入"+animal2.name+"的加速度:");
        y1=input.nextDouble();
        if(y1!=0){
            System.out.println(animal2.name+"奔跑的距離:"+animal2.distance(x1, y1));
        }else {
            System.out.println(animal2.name+"奔跑的距離:"+animal2.distance(x1));
        }

        Human human1=new Human("阿克", 1.9, 80, 150, "男");
        human1.show();
        double x2;
        double y2;
        System.out.print("請輸入"+human1.name+"奔跑的時間(分鐘):");
        x2=input.nextDouble();
        System.out.print("請輸入"+human1.name+"的加速度:");
        y2=input.nextDouble();
        if(y2!=0){
            System.out.println(human1.name+"奔跑的距離:"+human1.distance(x2, y2));
        }else {
            System.out.println(human1.name+"奔跑的距離:"+human1.distance(x2));
        }

        Human human2=new Human("漢斯", 1.8, 78, 130, "男");
        human2.show();
        double x3;
        double y3;
        System.out.print("請輸入"+human2.name+"奔跑的時間(分鐘):");
        x3=input.nextDouble();
        System.out.print("請輸入"+human2.name+"的加速度:");
        y3=input.nextDouble();
        if(y3!=0){
            System.out.println(human2.name+"奔跑的距離:"+human2.distance(x3, y3));
        }else {
            System.out.println(human2.name+"奔跑的距離:"+human2.distance(x3));
        }

        Human human3=new Human("安那", 1.7, 48, 120, "女");
        human3.show();
        double x4;
        double y4;
        System.out.print("請輸入"+human3.name+"奔跑的時間(分鐘):");
        x4=input.nextDouble();
        System.out.print("請輸入"+human3.name+"的加速度:");
        y4=input.nextDouble();
        if(y4!=0){
            System.out.println(human3.name+"奔跑的距離:"+human3.distance(x4, y4));
        }else {
            System.out.println(human3.name+"奔跑的距離:"+human3.distance(x4));
        }

        Snow snow1=new Snow("愛沙", 1.7, 50, 120, "女", "Yes");
        snow1.show();
        double x5;
        double y5;
        System.out.print("請輸入"+snow1.name+"奔跑的時間(分鐘):");
        x5=input.nextDouble();
        System.out.print("請輸入"+snow1.name+"的加速度:");
        y5=input.nextDouble();
        if(y5!=0){
            System.out.println(snow1.name+"奔跑的距離:"+snow1.distance(x5, y5));
        }else {
            System.out.println(snow1.name+"奔跑的距離:"+snow1.distance(x5));
        }


    }
}