import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by YuxuanXu on 2021/5/24
 */
public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        //JAVAThe compiler considers these exceptions to be very serious,
        // and we know that IO problems may occur, so we must indicate throws IOException
        Scanner in = new Scanner(Paths.get("test.txt"), "UTF-8");
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            sb.append(in.nextLine()).toString();
            System.out.println(sb.toString());
        }
    }
}
