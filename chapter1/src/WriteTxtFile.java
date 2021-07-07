import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by YuxuanXu on 2021/5/24
 */
public class WriteTxtFile {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("test1.txt", "UTF-8");){
            //This path is a relative path, relative to the path to start IDEA.
            out.println("My name is ans! ");
            out.println("Hello World");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
