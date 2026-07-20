package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;

    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s){
        return Double.compare(this.cgpa, s.cgpa);
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Sophie", 25, 8.6);
        Student s2 = new Student("Rachel", 36, 7.2);
        Student s3 = new Student("Caroline", 15, 9.4);
        Student s4 = new Student("David", 6, 8.5);
        Student s5 = new Student("Adam", 16, 9.2);

        Student[] s = {s1, s2, s3, s4, s5};
        Arrays.sort(s);

        for (Student stu : s){
            System.out.println(stu.name+": "+stu.cgpa);
        }
    }
}
