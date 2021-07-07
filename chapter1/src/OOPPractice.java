import java.util.ArrayList;

/**
 * Created by YuxuanXu on 2021/6/10
 */


public class OOPPractice {

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;
        p1.showAge();
        p1.addAge(2);
        p1.showAge();

        Circle c1 = new Circle();
        c1.radius = 10;
//        c1.calculate();
        System.out.println(c1.calculateArea());

        OOPPractice test = new OOPPractice();

        //创建对象，这个对象是主类的
        System.out.println(test.method(3,4));


        //声明对象类型数组例如
        student[] stus = new student[20];

        for (int i = 0;i<stus.length;i++)
        {
            stus[i] = new student();
            stus[i].number = i+1;
            stus[i].state = (int) (Math.random()*6+1);
            stus[i].score = (int) (Math.random()*101);
            System.out.println(stus[i].state);
        }
        //模板1 psvm sout
        //模板2 fori 快速创建for循环
        //变形 iter for-each循环
        //模板3 list遍历 list.for/list.fori这两个是正序 list.forr是倒序
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        for (Object o : list) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //模板4 ifn
        if (stus == null) {

        }
        //模板5 inn (if not null)


        //匿名对象。
        // 我们创建的对象，没有显式的赋给一个变量名，即为匿名对象。
        // 匿名对象只能调用一次
        // 使用：
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());

        new Phone().sendEmail();
        new Phone().playGame();
        new Phone().price = 2000;
        new Phone().showPrice();  //显示0.0 因为新new了一个


    }

    /**
     * @discribe 画矩形的*
     * @param a
     * @param b
     * @return 面积
     */
    public int method(int a,int b){  //这个方法是定义在主类里的
        for (int i=0;i < a;i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return a*b;
    }
}

class Person1{
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        this.age += i;
        return this.age;
    }
}

class Circle{
    double radius;
    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }
}

class PassObject{
    public static void printAreas(Circle c, int time){
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.printf("%.0f, \t %.2f",c.radius,c.calculateArea());
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Circle c = new Circle();
        printAreas(c,5);
    }
}

class student{
    int number;
    int state ;
    int score ;
}

class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    //模板6 prsf  private static final声明静态常量
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println(price);
    }
}

class PhoneMall{
    public void show (Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
