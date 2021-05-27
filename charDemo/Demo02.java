package charDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 1. 创建FileReader
        FileReader reader = new FileReader("src/charData/hello.txt");
        // 2. 读取
        // 3. 单字符读取
//        int data = 0;
//        while ((data = reader.read()) != -1) {
//            System.out.print(data);
//            System.out.print((char)data);
//        }
        //缓冲区
        char[] buffer = new char[1024];
        int count = 0;
        while ((count = reader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, count));
        }


        reader.close();
    }
}
