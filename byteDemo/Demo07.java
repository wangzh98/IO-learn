package byteDemo;

import java.io.*;

// ObjectInputString 反序列化
public class Demo07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建流
        InputStream is = new FileInputStream("src/byteData/object.bin");
        ObjectInputStream ois = new ObjectInputStream(is);
        Student s = (Student)ois.readObject();

        ois.close();
        System.out.println("ok");
        System.out.println(s.toString());
    }
}
