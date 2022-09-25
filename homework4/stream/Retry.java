package oop.homework4.stream;

import java.util.ArrayList;

public class Retry {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(){
            {
                add(new Student("Hiep", 20, 6, 7));
                add(new Student("Thang", 20, 8, 9));
                add(new Student("Nam", 21, 3, 8));
                add(new Student("Thuy", 26, 4, 5));
                add(new Student("Hieu", 29, 9, 10));
                add(new Student("Trung", 22, 7.6, 3.4));
                add(new Student("Tien", 20, 5.2, 2.1));
                add(new Student("Hung", 20, 3.67, 2.6));
            }
        };

        System.out.println("Danh sach ban dau");
        students.forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("Danh sach hoc sinh co diem trung binh < 5");
        students.stream()
                .filter(student -> student.gpa() < 5)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("Danh sach hoc sinh co diem toan > 5, va diem lich su < 7");
        students.stream()
                .filter(student -> student.getMathScore() > 5)
                .filter(student -> student.getHistoryScore() < 7)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("Danh sach hoc sinh bo qua 2 hoc vien dau tien va 2 hoc sinh cuoi cung");
        students.stream()
                .limit(students.size() - 2)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        System.out.println("Danh sach hoc sinh bo qua 2 hoc vien dau tien va 2 hoc sinh cuoi cung , co tuoi > 20 va < 25");
        students.stream()
                .limit(students.size() - 2)
                .skip(2)
                .filter(student -> student.getAge() > 20)
                .filter(student -> student.getAge() < 25)
                .forEach(System.out::println);
    }
}
