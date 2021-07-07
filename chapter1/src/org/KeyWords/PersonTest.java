package org.KeyWords;

/**
 * @author Yuxuan
 * @create 2021-06-25 17:32
 */
public class PersonTest {
    /**
     * this关键字的使用
     * 在类的方法中，我们可以使用“this.属性”或“this.方法”来调用属性和方法，一般省略。
     * 但如果方法的形参和属性同名时，就必须使用this
     *
     * 在类的构造器中，同样如此
     *
     * this调用构造器
     * ①我们在类的构造器中，可以显式的使用“this(形参列表)”，调用本类中指定的其他构造器
     * ②避免调用环的出现
     * ③this(形参列表)必须在当前构造器的首行，唯一调用
     */
}
class Person{
    private String name;
    private int age;
    public Person(){
//Person初始化时需要考虑的1234（40行代码）
    }
    public Person(String name){
        this();//如何构造器里调用构造器，就用this(形参列表)
        this.name = name;
    }
    public Person(int age){
        this();
        this.age = age;
    }
    public Person(String name,int age){
        this(age);
        this.name = name;
//        this.age = age;   因为调用了this(age),age已经被赋值了，所以这个代码就不用了
    }
}

class Boy{
    private int age;
    private String name;

    public Boy() {
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name) {
        this.name = name;
    }
    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl){
        System.out.println("男女结婚");
    }

    public void shout(){
        if (age>22){
            System.out.println("可以结婚了");
        }
        else{
            System.out.println("还不行结婚");
        }
    }
}

class Girl{
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void marry(Boy boy){
        System.out.println("女男结婚");
        boy.marry(this);
//        this表示当前对象，所以就是this
    }
}