变量一定要显式初始化

常量声明用final，一般常量全大写。

变量名一定字母开头且不能有空格。

类常量在main外面，整个类内的函数都能用。

强制类型转换的语法格式是

在圆括号中给出想要转换的目标类型，后面紧跟待转换的变量名。

Math.rount(double)

Math.pow(double,double)

数据类型(这个之前没注意一共有8种类型，4种整型，2种浮点类型，1种Unicode编码的字符单元的字符类型char,一种是表示真假的Boolean)转换是优先级是double>float>long>int

如果运算符得到一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换。例如，如果x是一个int，则以下的语句
`x += 3.5;`
是合法的,将把x设置为`(int)(x + 3.5)`

因为+=是右结合运算符，所以表达式`a+=b+=c`等价于`a+=（b+=c）`

切子串包左不包右，
```
String greeting = "Hello";
String s = greeting.substring(1,3) ;
```
这种切割语法的好处是可以迅速知道去了几个字符直接就是`String.substring(a,b)`b-a个字符
