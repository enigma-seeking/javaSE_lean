package org.bjtu.polymorphism;

/**
 * @author Yuxuan
 * @Description:
 * @create 2021-06-28 17:48
 * @param:
 */
public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人赚钱养家");
    }

    @Override
    public void eat(){
        System.out.println("男人：干饭");
    }

    @Override
    public void walk(){
        System.out.println("男人：走路运动");
    }

}
