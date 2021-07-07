package org.bjtu.polymorphism.example;

/**
 * @author Yuxuan
 * @Description:
 * @create 2021-06-28 19:07
 * @param:
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest a = new AnimalTest();
        a.func(new Dog());
        a.func(new Cat());

    }
    public void func(Animal animal){
        //形参虽然是父类Animal，但是可以赋给子类cat，dog。然后调用重写方法
        animal.eat();
        animal.sout();
    }
}

class Animal{
    public void eat(){
        /**

             * @Description //TODO
             * @Date  2021/6/28
             * @Param []
             * @return void
             **/
        System.out.println("动物进食");
    }

    public void sout(){
        /*

             * @Description //TODO
             * @Date  2021/6/28
             * @Param []
             * @return void
             **/
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){

        System.out.println("狗吃骨头");
    }
    @Override
    public void sout(){

        System.out.println("汪！汪！汪！");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){

        System.out.println("猫吃鱼");
    }
    @Override
    public void sout(){

        System.out.println("汪！汪！汪！");
    }
}
