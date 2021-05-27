package byteDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 字节缓冲流
public class Demo04 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/byteData/aaa.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        // private static int DEFAULT_BUFFER_SIZE = 8192;
        // 先把需要的数据从硬盘中读到内存缓冲区中
//        int data = 0;
//        while ((data = bis.read()) != -1) {
//            System.out.println((char) data);
//        }

        byte[] buffer = new byte[1024];
        int count = 0;
        while((count=bis.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, count));
        }
        // bis创建缓冲区读硬盘，我们再自己创建缓冲区读bis创建的缓冲区的内容

        bis.close(); // 会自动关闭fis
    }

}
