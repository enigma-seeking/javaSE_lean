/**
 * @author Yuxuan
 * @create 2021-06-16 21:16
 */
public class InterestingProblem {
    /**
    这里放一些有意思的题
     **/
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr);
        //这个结果是地址值，因为调用的是(Object a)

        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1);
        //这个是实际的abc，因为调用的是(Char c)
    }
}

