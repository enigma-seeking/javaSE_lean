/**
 * Created by YuxuanXu on 2021/6/9
 */

/***************尚硅谷JAVA面向对象的视频*****************/
public class PersonTest {
    public static void main(String[] args) {
        //常见person类对象
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1; //这个并不是新创建对象是新声明变量
        //对象放在栈里

        //调用属性
        p1.name = "tom";
        p1.isMale = true;
        //调用方法
        p1.print();
        p1.sleep();
        p1.eat();
        p1.talk("Chinese");

    }

}
class Person{
    //属性（成员变量）定义在类里面的变量是成员变量
    String name;
    int age;
    boolean isMale;

    //方法：描述类应该具有的功能
//  方法可以用static、final、abstract来修饰
//    方法使用中可以调用当前类的属性和方法

    public void eat(){
        String food = "pizza";  //定义在方法内的是局部变量
        System.out.println("people can eat");
    }
    public void sleep(){
        System.out.println("people can sleep");
    }

    public void talk(String language){ //language 是形参
        System.out.println("people speak "+language);
    }

    public void print() {
        System.out.println(name+" "+age+" "+isMale);
    }

//    属性和局部变量的不同
//    1、属性（成员变量）可以有权限修饰符，可以指明其权限  常用的权限修饰符：private（出了这个类就不能调用了，但是在类里面还是可以调用的）、public、protected、缺省
//    2、默认初始化值有不同，属性根据其类型都有默认初始化值     局部变量没有默认初始化
//    3、内存位置不同 属性：加载到堆中   局部空间在栈中
//
}
