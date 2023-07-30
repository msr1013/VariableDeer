package AbstractStudent;

import Accountbalance.Account;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]= new PhdStudent();
        students[1] = new PhdStudent();
        students[2] = new PhdStudent();

        List<Student> studentList= new ArrayList<>();
        studentList.add(new PhdStudent());
        studentList.add(new PhdStudent());
        studentList.add(new GradStudent());

    }
}
