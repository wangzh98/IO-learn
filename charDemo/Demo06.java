package charDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// BufferWriter
public class Demo06 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src/charData/output2.txt");
        BufferedWriter bw = new BufferedWriter(writer);

        for (int i = 0; i < 10; i++) {
            bw.write("好好学习天天向上");
//            bw.write("/r/n");
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
