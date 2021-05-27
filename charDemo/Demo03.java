package charDemo;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter
public class Demo03 {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileWriter fw = new FileWriter("src/charData/bbb.txt");
        for (int i = 0; i < 10; i++) {
            fw.write("Java是世界上最好的语言\r\n");
            // 是字符串有buffer 要flush
            fw.flush();
            //close() generally calls flush() as well,
            // but it's recently been pointed out to me that in some JDK implementations,
            // any exceptions thrown by flushing as part of closing are swallowed :(
        }
        String str = "Java是世界上最好的语言\r\n";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        Thread.sleep(10000);
        // close的时候创建文件
        fw.close();
    }
}
