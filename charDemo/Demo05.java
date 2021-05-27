package charDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//字符缓冲流读取文件
public class Demo05 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲流
        FileReader fr = new FileReader("src/charData/bbb.txt");
        BufferedReader br = new BufferedReader(fr);
        // 读
//        char[] buffer = new char[1024];
//        int count = 0;
//        while ((count = br.read(buffer)) != -1) {
//            System.out.print(new String(buffer, 0, count));
//        }
        String line;
        while ( (line =br.readLine()) != null) {
            System.out.println(line);
        }



        br.close();
    }
}
