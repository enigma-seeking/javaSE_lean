package org.Practice;

/**
 * @author Yuxuan
 * @create 2021-06-25 16:24
 */
public class constructorTest {
    //    类的结构之三:构造器

    /**    构造器的作用
     * 1.创建对象
     * 2.创建对象的同时可以对属性进行初始化
     *  说明
     *  如果没有显式的定义类的构造器的话，系统默认定义一个空参构造器
     *  定义构造器的格式：权限修饰符 类名(形参列表){} 构造器在类里定义
     *  只要你定义了构造器，那么就没有系统默认的空参构造器了，如果想用自己在定义
     */
    /**
     * 属性赋值的先后顺序
     * ①默认初始化
     * ②显示初始化 int num = 2；
     * ③构造器赋值
     * ④调用方法赋值
     *
     */
    public static void main(String[] args) {
//        创建类的对象: new+构造器
        Person p1 = new Person();
        
        Person p2 = new Person("Tom");
        System.out.println("p2.name = " + p2.name);

        TriAngle t = new TriAngle(3,2);
        System.out.println(t.getBase()*t.getHeight());
    }
}

class Person{
    //属性

    String name;
    int age;

    //构造器

    public Person(){
        System.out.println("构造器");
    }//这是最简单的构造器（默认就是这样的）
//可以定义多个构造器，形参不一样即可，可以初始化造的对象的属性
    public Person(String n){
        name = n;
    }

    //方法
    public void eat(){
        System.out.println("Person can eat");
    }
}

class TriAngle{
    private int base;
    private int height;

    public TriAngle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}