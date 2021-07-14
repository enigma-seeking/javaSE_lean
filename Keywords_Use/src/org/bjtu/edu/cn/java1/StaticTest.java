package org.bjtu.edu.cn.java1;
/*

     * @Description //TODO
     * @Date  2021/7/12
     * @Param
     * @return
     我们有时候希望无论是否产生了对象或无论产生了多少对象的情况下，某些
     特定的数据在内存空间中只有一份
     static 关键字的使用
     1 static 可以用来修饰：属性、方法、代码块、内部类（不能修饰构造器）
     static 修饰属性：
     属性按照是否使用static修饰，有分为静态属性 vs 非静态属性（实例变量）
     静态变量随着类的加载而加载,加载早于对象的创建,实例变量一般都是对象创建中或者创建后
    类只加载一次，静态变量在内存中只有一份，存在方法区的静态域中。

            类变量   实例变量
    类       yes     no
    对象      yes     yes

    静态属性举例：system.out； Math.PI

static 修饰方法：
1⃣️随着类的加载而加载,可以通过"类.方法"来调用
2.      staticfunction            unstaticFunction
   class    yes                          no
   object   yes(can't use)              yes

staticfunction only call staticfunction or staticattribute
this can be explained by the life cycle.

~unstaticfunction not only call unstaticfunc or unstaticattri but also call staticfunction or attribute

~in staticfunction, cannot use keywords this, super

summery
in development, How to determine whether a property should be declared as static
property shared by all objects

in development, How to determine whether a function should be declared as static
`Methods of manipulating static properties
`tools functions
     **/
public class StaticTest{

    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "ming";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "ccc";
        c2.age = 20;

        Chinese.nation = "China";
        Chinese.show();
        //c1.show();
//        c1.nation = "China";
//        System.out.println(c2.nation);

        // 直接用类进行访问。所以静态变量也被叫做类变量
    }
}

/**
 * 中国人
 *
 * @author enigma-seeking
 * @date 2021/07/14
 */
class Chinese {
    String name;
    int age;
    static String nation ;

    static void show(){
        System.out.println("我是一个中国人");
    }
}