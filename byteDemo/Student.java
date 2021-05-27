package byteDemo;

import java.io.Serializable;
// transient 属性不被序列化
// 静态属性不序列化
public class Student implements Serializable {

    private static final long serialVersionUID = 100L;
    // 对象流 内存里的对象-硬盘
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
