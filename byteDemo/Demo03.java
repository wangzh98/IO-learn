package byteDemo;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("src/byteData/aaa.txt");
        OutputStream outputStream = new FileOutputStream("src/byteData/ccc.txt");
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = fis.read(buffer)) != -1) {
            outputStream.write(buffer,0,count);
        }
        fis.close();
        outputStream.close();
    }
}

