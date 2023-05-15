package Student;

public class Student {
    private int roll_num;
    private String name;
    private int age;

    private Subject s1;

    public Subject getS1() {
        return s1;
    }

    public void setS1(Subject s1) {
        this.s1 = s1;
    }

    public Student(int roll_num, String name, int age, Subject s1) {
        this.roll_num = roll_num;
        this.name = name;
        this.age = age;
        this.s1 = s1;
    }

    public int getRoll_num() {
        return roll_num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
