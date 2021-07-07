package org.bjtu.polymorphism;

/**
 * @author Yuxuan
 * @Description:
 * @create 2021-06-28 17:48
 * @param:
 */
public class Woman extends Person{
    boolean isBeaty;
    public void goshopping(){
        System.out.println("女生喜欢购物");
    }
    @Override
    public void eat(){
        System.out.println("女人：少吃");
    }
    @Override
    public void walk(){
        System.out.println("女人：慢走");
    }
}
