package Student;

import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BL b1 = new BL();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.ADD STUDENT\t2.DISPLAY STUDENT\t3.REMOVE STUDENT\t4.UPDATE STUDENT SUBJECT\t5.SEARCH STUDENT BY ID\t 6.DISPLAY STUDENT BY SUBJECT\t7.EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add_Student();
                    break;
                case 2:
                    show_Student();
                    break;
                case 3:
                    remove_Student();
                    break;
                case 4:
                    update_Student_Subject();
                    break;
                case 5:
                    search_Student_By_Id();
                    break;
                case 6:
                    display_Student_By_Subject();
                    break;
                case 7:
                    System.out.println("Exited");
                    flag = false;
                    break;
                default:
                    System.out.println("enter valid choice");
            }
        }
    }

    private static void display_Student_By_Subject() {
        System.out.print("enter sub_name : ");
        String sub_name = sc.next();
        b1.display_Student_By_Subject(sub_name);
        System.out.println("student data added successfully");
    }

    private static void search_Student_By_Id() {
        System.out.print("enter student roll num  : ");
        int roll_num = sc.nextInt();
        b1.search_Student_By_Id(roll_num);
    }

    private static void update_Student_Subject() {
        System.out.print("enter student roll num  : ");
        int roll_num = sc.nextInt();
        System.out.print("enter sub_id : ");
        int sub_id = sc.nextInt();
        System.out.print("enter sub_name : ");
        String sub_name = sc.next();
        System.out.print("enter sub_fee : ");
        double sub_fee = sc.nextInt();
        boolean flag = b1.update_Student_Subject(roll_num, sub_id, sub_name, sub_fee);
        if (flag) {
            System.out.println("Student Subject Updated Successfully");
        } else {
            System.out.println("student not found");
        }
    }

    private static void remove_Student() {
        System.out.print("enter student roll num  : ");
        int roll_num = sc.nextInt();
        boolean flag = b1.remove_Student(roll_num);
        if (flag) {
            System.out.println("data deleted successfully");
        } else {
            System.out.println("student not found");
        }
    }

    private static void show_Student() {
        b1.show_Student();
    }

    private static void add_Student() {
        System.out.print("enter student roll num  : ");
        int roll_num = sc.nextInt();
        System.out.print("enter student name : ");
        String name = sc.next();
        System.out.print("enter student age : ");
        int age = sc.nextInt();
        Subject s2 = add_Subject();
        Student s1 = new Student(roll_num, name, age, s2);
        b1.add_Student(s1);
    }

    private static Subject add_Subject() {
        System.out.print("enter sub_id : ");
        int sub_id = sc.nextInt();
        System.out.print("enter sub_name : ");
        String sub_name = sc.next();
        System.out.print("enter sub_fee : ");
        double sub_fee = sc.nextInt();
        return new Subject(sub_id, sub_name, sub_fee);
    }
}
