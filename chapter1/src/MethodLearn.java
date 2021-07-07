/**
 * @author Yuxuan
 * @create 2021-06-13 20:35
 */
public class MethodLearn {
    //重点是方法参数的值传递机制
    //方法重载：在同一个类中，允许存在多个重名方法，只要参数不同即可
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(123);
        test.show("hello");
        //如果将show(String s)删除也不会报错，会调用可变参数那个方法
        test.show("hello","world");
    }

}
class MethodArgsTest {
    //可变个数形参方法，JDK5.0新特性
    //格式：数据类型 ... 变量名
    public void show(String s){

    }
    public void show(int i){

    }
    public void show(String ... strs){
        //show(String ... strs)是可以和show(String s)共存构成重载
        //但是这个如果定义为show(String[] strs)就不行了，两个代表一个意思。

    }
    public void show(int i, String ... strs){
        //可变个数形参在方法的形参中，必须声明在末尾
        //可变个数形参在方法的形参中，最多只能声明一个可变形参

    }
    //关于变量的赋值。
    // 1.如果是基本数据类型，赋值的是变量所保存的数据值；
    // 2如果是引用数据类型，此时复制的是变量所保存的数据的地址值。
}

class ValueTransferTest {
    /**
    方法形参的的传递机制：值传递
    1.形参：方法定义时，声明的小括号内的参数
    2.实参：方法调用时。实际传递给形参的数据
     */
    public static void main(String[] args) {
        Date data = new Date();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m+", n = "+data.n);
        data.swap(data);
        System.out.println("m = " + data.m+", n = "+data.n);
    }
}

class Date{
    int m;
    int n;
    public void swap(Date data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

/**
 * 1.什么是方法的重载？
 * 同类、相同方法名；参数列表不同
 * 2.说明JAVA方法中的参数传递机制的具体体现？
 * 数据时基本数据类型时：数据值
 * 引用数据类型时：地址值（含变量的数据类型）
 * 3.成员变量和局部变量在声明的位置上、
 * 是否有默认初始化之上、是否能有权限修饰符修饰上、
 * 内存分配的位置上有何不同
 *
 * 1、内存结构：栈（局部变量）、堆（new出来的结构：对象和数组）
 */

