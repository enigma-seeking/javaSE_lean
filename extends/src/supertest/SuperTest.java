package supertest;
/**
 * @author Yuxuan
 * @Description:
 * @create 2021-06-28 10:26
 * @param:
 */

/*
     
     * @Description //TODO 
     * @Date  2021/6/28
     * @Param 
     * @return
     super代表父类的
     super可以用来调用父类的结构：属性、方法、构造器
     通常情况下我们都省略super。但如果子类和父类定义了同名属性时，
     想要在子类中调用父类的属性时，必须使用super
     实际中很少会在子类和父类中定义同名属性

     后一种情况更为常见
     方法的调用，如果子类重写了方法，如果想在子类中调用父类中被重写的方法，就需要使用super。

     super调用构造器
     在子类构造器中显式地使用"super(形参)"的方式调用父类中指定的构造器
     super必须声明在构造器中的首行
     我们在类的构造器中，针对this(形参)和super(形参)只能二选一
     如果上述两种哪个都没用，那么默认的是调用父类中空参构造器

     在类的多个构造器中，至少有一个使用super调用了父类的构造器

     **/

public class SuperTest {
    
}
