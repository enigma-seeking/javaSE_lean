<img src="D:\JAVA_learn\InterviewProblem\InterviewProblems.assets\image-20210704201251690.png" alt="image-20210704201251690" style="zoom:78%;" />



==既可以比较基本类型也可以比较引用类型，对于基本类型就是比较值，对于引用类型内存就是比较内存地址。

equals的话，它是属于java.lang.Object类里面的方法，如果该方法没有被重写过默认也是==；但在String等类的equals方法是被重写过的，而且String类在日常中用的比较多，久而久之，形成了equals是比较值的错误观点。



具体要看自定义类里有没有重写equals



通常情况下，重写equals方法，会比较类中的相应属性是否相等。

引用数据类型有三种：类；数组；接口。

直接进行测试