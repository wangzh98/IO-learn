package byteDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// ObjectOutputString 实现对象序列化
public class Demo06 {
    public static void main(String[] args) throws IOException {
        // 1. 创建对象流
        FileOutputStream fileOutputStream = new FileOutputStream("src/byteData/object.bin");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        // 2. 序列化
        Student zhangsan = new Student("张三", 20);
        outputStream.writeObject(zhangsan);

        outputStream.close();
        System.out.println("完毕");
    }
}
