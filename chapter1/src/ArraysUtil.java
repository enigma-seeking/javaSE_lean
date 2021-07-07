/**
 * @author Yuxuan
 * @create 2021-06-13 19:41
 */
public class ArraysUtil {
    //求数组最大值dfddfd
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    //求数组最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (minValue > arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;

    }
    //求数组平均值
    public double getAvg(int[] arr){
        double avg = sum(arr)/arr.length;
        return avg;
    }
    //求数组总和
    public int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //反转数组
    public void convert_reverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
