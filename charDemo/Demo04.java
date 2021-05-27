package charDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 字符流复制文件, 只能复制文本文件，不能复制其他二进制文件
public class Demo04 {
    public static void main(String[] args) throws IOException {
        // 1. 创建
        FileReader fr = new FileReader("src/charData/bbb.txt");
        FileWriter fw = new FileWriter("src/charData/output.txt");
        int data = 0;
        while ((data = fr.read()) != -1) {
            fw.write(data);
        }
        fr.close();
        fw.close();
    }
}
