package org.bjtu.edu.cn.java1;

/**
 * 单例test2
 *
 * @author Yuxuan
 * @Description:
 * @create 2021-07-17 10:30 上午
 * @param:
 * @date 2021/07/17
 * 懒汉式,好处：延迟对象的创建，不用一直占着内存,
 * 坏处是，目前看线程是不安全的，银行取钱的例子
 *
 * 饿汉式：线程是安全的
 * 饿汉式：对象加载时间过长
 * 单例模式只剩成一个实例，减少了系统的性能开销，当一个对象的产生需要较多的资源时，
 * 如读取配置、产生其他以来对象时，则可以应用启动时直接产生一个实例对象。
 *
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }


}

class Order{
    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类的对象，没有初始化,{区别点}
    private static Order instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
//        instance = new Order();//这么写对象不是固定的一个了
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

}
