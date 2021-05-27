package byteDemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节文件输入流
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 1. 创建流
//        System.out.println(System.getProperty("user.dir"));
        FileInputStream fileInputStream = new FileInputStream("src/byteData/ddd.txt");
        // 2. 读文件

        // 2.1 单个字节读
        int data = 0;
        while ((data = fileInputStream.read())!= -1) {
            System.out.println(data);
        }

        // 2.2 一次读多个字节
//        byte[] buf = new byte[1024];
//        int count = 0;
//        while ((count = fileInputStream.read(buf)) != -1) {
//            System.out.println(new String(buf,0,count));
//        }

        fileInputStream.close();
        System.out.println();
        System.out.println("执行完毕");

    }
}
