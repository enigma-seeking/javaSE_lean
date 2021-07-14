<img src="D:\JAVA_learn\InterviewProblem\InterviewProblems.assets\image-20210704201251690.png" alt="image-20210704201251690" style="zoom:78%;" />



==既可以比较基本类型也可以比较引用类型，对于基本类型就是比较值，对于引用类型内存就是比较内存地址。

equals的话，它是属于java.lang.Object类里面的方法，如果该方法没有被重写过默认也是==；但在String等类的equals方法是被重写过的，而且String类在日常中用的比较多，久而久之，形成了equals是比较值的错误观点。



具体要看自定义类里有没有重写equals



通常情况下，重写equals方法，会比较类中的相应属性是否相等。

引用数据类型有三种：类；数组；接口。

直接进行测试



1.如何实现向下转型？需要注意什么问题？如何解决此问题？

Person p = new Man();
使用强转符：()
Man m = (Man)p;

可能ClassCastException异常。

使用instanceof在进行向下转型前判断。
if(p instanceof Man){
	Man m = (Man)p;
}




3.class User{
String name;
int age;
	//重写其equals()方法
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}

		if(obj instanceof User){
			User u = (User)obj;
			return this.age == u.age && this.name.equals(u.name);
		}
	
		return false;
	}

}
4. 写出8种基本数据类型及其对应的包装类

int  Integer
char Character

5. 基本数据类型、包装类与String三者之间如何转换

自动装箱、自动拆箱

Integer i = 10;

基本数据类型、包装类--->String: valueOf(Xxx xx)
String--->基本数据类型、包装类:parseXxx(String s)

/*
* java.lang.Object类
* 1.Object类是所有Java类的根父类
* 2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
* 3.Object类中的功能(属性、方法)就具有通用性。
* 	属性：无
*  方法：equals() / toString() / getClass() /hashCode() / clone() / finalize()
*     wait() 、 notify()、notifyAll()
*
* 4. Object类只声明了一个空参的构造器
*
*
*
* 面试题：
* final、finally、finalize的区别？
*
*/