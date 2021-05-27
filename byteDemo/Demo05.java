package byteDemo;

import java.io.*;

// 字节缓冲流写文件
public class Demo05 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("src/byteData/ddd.txt");
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        for (int i = 0; i < 10; i++) {
            bos.write("hello world\r\n".getBytes());
        }
        // 先写到缓冲区里 没到8k之前
        bos.flush();
        bos.close(); // 内部也调用outputStream close
    }
}
