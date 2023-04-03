public class A1103303_0331_animal{
    String name;
    double height;
    double weight;
    double speed;

    A1103303_0331_animal(String name, double height, double weight, double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    void show(){
        System.out.println("姓名:"+name+" 身高: "+height+" 體重: "+weight+" 速度:"+speed);
    }

    double distance(double x, double y){
        return this.speed*x*y;
    }

    double distance(double x){
        return this.speed*x;
    }

    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
class Human extends A1103303_0331_animal{
    String gender;

    public Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    void show(){
        System.out.println("姓名:"+name+" 身高: "+height+" 體重: "+weight+" 性別: "+gender+" 速度:"+speed);
    }
    
}
class Snow extends Human{
    String freeze;
    
    public Snow(String name, double height, double weight, double speed, String gender, String freeze) {
        super(name, height, weight, speed, gender);        
        this.freeze = freeze;
    }
    void show(){
        System.out.println("姓名:"+name+" 身高: "+height+" 體重: "+weight+" 性別: "+gender+" 冰凍技能: "+freeze+" 速度:"+speed);
    }

    double distance(double x, double y){
        return (this.speed*x*y)*2;
    }

    double distance(double x){
        return (this.speed*x)*2;
    }

}
