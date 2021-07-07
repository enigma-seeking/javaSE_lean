import java.util.Scanner;
/**
 * @author 17211
 */
public class StringEditor {
    public static void main(String[] args) {
        String greeting = "  hello world!  ";
//        int n = greeting.length();
//        int cpCount = greeting.codePointCount(0, greeting.length());
//        System.out.println(cpCount);
        char test = greeting.charAt(6);
        System.out.println(greeting.compareTo("world!"));
        //如果第一个字符和参数的第一个字符不等，结束比较，返回第一个字符的ASCII码差值。
        // 如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推，直至不等为止，返回该字符的ASCII码差值。如果两个字符串不一样长，可对应字符又完全一样，则返回两个字符串的长度差值。
        System.out.println(greeting.indexOf(" world",5));
        System.out.println(greeting.replace(" ","_"));
        System.out.println(greeting.trim());
        //返回一个新字符串。这个字符串将删除了原始字符串头部和尾部的空格。

        /*
        利用字符串构建器 构建字符串
        */
        StringBuilder builder = new StringBuilder();
        builder.append("ch");
        System.out.println(builder);
        builder.setCharAt(1,'3');
        //setCharAt() is modify the existing chars, but can't creat new chars. and it return type is void.
        System.out.println(builder);
        System.out.println(builder.insert(1,"swe"));
        System.out.println(builder.delete(1,3));
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        //This usage takes into account that there are spaces in the input.
        System.out.println("Hello, "+name+" next year, you'll be "+(age+1));

    }

}
