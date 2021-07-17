package org.bjtu.edu.cn.java1;

/**
 * @author Yuxuan
 * @Description:
 * @create 2021-07-17 9:45 上午
 * @param:
 */
public class SingletonTset1 {
//    设计模式是在大量的实践中总结和理论化之后优选的代码结构、
//    编程风格、以及解决问题的思考方式。
//    单例设计模式是static关键字的一种应用。单例设计模式就是对某一个类只能存在一个对象实例。并且该类只提供一个取得其对象实例的方法。
//    如果我们要让类在一个虚拟机中只能产生一个对象，我们首先必须将类的构造器的访问权限设置为private，
//    这样，就不能用new操作符在类的外部产生类的对象了，但在类内部仍可以产生该类的对象。因为在类的外部开始还无法得到类的对象，
//    只能调用该类的某个静态方法以返回类内部创建的对象，静态方法只能访问类中的静态成员变量，所以，指向类内部产生的该类对象的变量也必须定义成静态的。
}

/**
 * 银行
 *这种编程方式是饿汉式
 * @author enigma-seeking
 * @date 2021/07/17
 */
class Bank{
    //私有化构造器


    private Bank(){

    }

    //2.内部创建类的对象
    //4.要求吃对象必须声明为静态的
    private static Bank instance = new Bank();

    /**
     * 获得实例
     *必须要是静态的，非静态的，想要调用方法必须创建对象，但是这个方法就是要返回用的对象，成死循环了
     *
     * @return {@link Bank}
     *///3.提供公共的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
