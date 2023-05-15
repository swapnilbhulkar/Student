package Student;

import java.util.ArrayList;
import java.util.List;

public class BL {
    private static final List<Student> al = new ArrayList<>();

    static {
        al.add(new Student(101, "ram", 23, new Subject(11, "java", 3000)));
        al.add(new Student(102, "sham", 21, new Subject(12, "c", 2500)));
        al.add(new Student(103, "gopal", 22, new Subject(13, "j2ee", 4000)));
        al.add(new Student(104, "kiran", 26, new Subject(13, "j2ee", 4000)));
        al.add(new Student(105, "abhay", 22, new Subject(12, "c", 2500)));
        al.add(new Student(106, "satish", 23, new Subject(11, "java", 3000)));

    }

    public void add_Student(Student s1) {
        al.add(s1);
    }

    public void show_Student() {
        for (Student student : al) {
            System.out.println(student.getRoll_num() + "   " + student.getName() + "   " + student.getAge() + "   " + student.getS1().getSub_id() + "   " + student.getS1().getSub_name() + "   " + student.getS1().getSub_fee());
        }
    }

    public boolean remove_Student(int roll_num) {
        boolean b1 = false;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getRoll_num() == roll_num) {
                al.remove(i);
                b1 = true;
                break;
            }
        }
        return b1;
    }

    public boolean update_Student_Subject(int roll_num, int sub_id, String sub_name, double sub_fee) {
        boolean b1 = false;
        for (Student student : al) {
            if (student.getRoll_num() == roll_num) {
                student.getS1().setSub_id(sub_id);
                student.getS1().setSub_name(sub_name);
                student.getS1().setSub_fee(sub_fee);
                b1 = true;
                break;
            }
        }
        return b1;
    }

    public void search_Student_By_Id(int roll_num) {
        boolean b1 = false;
        for (Student student : al) {
            if (student.getRoll_num() == roll_num) {
                System.out.println(student.getRoll_num() + "   " + student.getName() + "   " + student.getAge() + "   " + student.getS1().getSub_id() + "   " + student.getS1().getSub_name() + "   " + student.getS1().getSub_fee());
                b1 = true;
                break;
            }
        }
        if (!b1) {
            System.out.println("student not found");
        }
    }

    public void display_Student_By_Subject(String sub_name) {
        boolean b1 = false;
        for (Student student : al) {
            if (student.getS1().getSub_name().equals(sub_name)) {
                System.out.println(student.getRoll_num() + "   " + student.getName() + "   " + student.getAge() + "   " + student.getS1().getSub_id() + "   " + student.getS1().getSub_name() + "   " + student.getS1().getSub_fee());
                b1 = true;
            }
        }
        if (!b1) {
            System.out.println("student not found");
        }
    }

}
