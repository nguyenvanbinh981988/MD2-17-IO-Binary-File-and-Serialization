package QLSV;

import ProDuctManager.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
    Scanner input = new Scanner(System.in);
    List<Student> students = new ArrayList<>();

    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Show studentList");
        System.out.println("2. add student");
        System.out.println("3. edit student");
        System.out.println("4. delete student");
        System.out.println("5. sort studentList");
        System.out.println("6. Exit");

        int choice = Integer.parseInt(input.nextLine());
        try {
            if (choice >= 1 && choice <= 6)
                switch (choice) {
                    case 1:
                        showStudentList();
                        break;
                    case 2:
                        addStudent();
                        break;
                    case 3:
                        editStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        sortStudentList();
                        break;
                    case 6:
                        System.exit(0);
                }
        } catch (Exception e) {
            System.out.println("enter wrong, please try again");
            menu();
        }
    }


    public void showStudentList() {
        readAndWriteFile.readFileStudent(students);
        for (int i = 0; i < students.size(); i++) {
            if (i % 5 == 0 && i !=0) {
                input.nextLine();
            } else {
                System.out.println(students.get(i).toString());
            }
        }
    }


    public void addStudent() {
            try {
                System.out.println("Enter Student information");
                System.out.println("Enter Id");
                String id = input.nextLine();
                System.out.println("Enter Name");
                String name = input.nextLine();
                System.out.println("Enter Age");
                String age = input.nextLine();
                System.out.println("Enter Sex");
                String sex = input.nextLine();
                System.out.println("Enter Address");
                String address = input.nextLine();
                System.out.println("Enter Point");
                String point = input.nextLine();

                Student student = new Student(id, name, age, sex, address, point);
                readAndWriteFile.readFileStudent(students);
                students.add(student);
                readAndWriteFile.writeFileStudents(students);

            } catch (Exception e) {
                System.out.println("enter wrong, please try again");
            }
        }

    public void editStudent() {
        System.out.println("Enter Id want to edit");
        String id = input.nextLine();

        System.out.println("nhap thong tin moi cua Student");
        System.out.println("Enter ID");
        String ID = input.nextLine();
        System.out.println("Enter Name");
        String name = input.nextLine();
        System.out.println("Enter Age");
        String age = input.nextLine();
        System.out.println("Enter Sex");
        String sex = input.nextLine();
        System.out.println("Enter Address");
        String address = input.nextLine();
        System.out.println("Enter Point");
        String point = input.nextLine();
        Student student = new Student(ID, name, age, sex, address, point);

        readAndWriteFile.readFileStudent(students);
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.set(i, student);
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Enter Id want to Delete");
        String id = input.nextLine();

        readAndWriteFile.readFileStudent(students);
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                students.remove(i);
            }

        }
    }

    public void sortStudentList(){
        readAndWriteFile.readFileStudent(students);
        students.sort(Student::compareTo);
        readAndWriteFile.writeFileStudents(students);
    }
}
