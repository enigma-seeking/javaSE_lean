import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by YuxuanXu on 2021/5/27
 */
public class dateExampleOfObject {
    public static void main(String[] args) {
        //show calendar
        LocalDate data = LocalDate.now();
        int month = data.getMonthValue();
        int today = data.getDayOfMonth();
        System.out.println(month);
        System.out.println(today);
        data = data.minusDays(today-1);
        // 设置为这个月的第一天
        // The first day of this month is setup
        DayOfWeek weekday = data.getDayOfWeek();
        int value = weekday.getValue();
//        System.out.println(value);
//        System.out.println(weekday);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1;i<value;i++){
            System.out.print("    ");
        }
        //
        while (data.getMonthValue() == month)
        {
            System.out.printf("%3d", data.getDayOfMonth());
            if (data.getDayOfMonth() == today)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            data = data.plusDays(1);
            if (data.getDayOfWeek().getValue() == 1)
            {
                System.out.println();
            }
        }

    }
}
