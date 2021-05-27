package byteDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/byteData/bbb.txt");
//        fos.write(97);
//        fos.write('b');
//        fos.write('c');

        String string = "hello world";
        fos.write(string.getBytes());


        fos.close();
        System.out.println("finish");
    }
}
