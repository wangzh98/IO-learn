package charDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));
        FileInputStream fileInputStream = new FileInputStream("src/charData/hello.txt");

        int data = 0;
        while ((data=fileInputStream.read()) != -1) {
            System.out.print((char)data);
        }

        fileInputStream.close();
    }
}
