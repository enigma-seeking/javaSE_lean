/**
 * Created by YuxuanXu on 2021/5/24
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        String encoding = "utf-8";
        if (file.isFile() && file.exists()) {
            try {
                Scanner scanner = new Scanner(file, encoding);
                StringBuffer sb = new StringBuffer();
                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine()).toString();
                    System.out.println(sb.toString());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
