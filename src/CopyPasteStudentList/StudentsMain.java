package CopyPasteStudentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsMain implements Serializable {

    public static void main(String[] args) throws IOException {

        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Students(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Students(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Students(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Students(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeToFile("student.txt", students);

        List<Students> studentDataFromFile = readDataFromFile("student.txt");
        for (Students student : studentDataFromFile) {
            System.out.println(student);
        }
    }

        public static void writeToFile (String path, List < Students > students) throws IOException {
            try {
                FileOutputStream file = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
                objectOutputStream.writeObject(students);
                objectOutputStream.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public static List<Students> readDataFromFile(String path){
            List<Students> students = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                students = (List<Students>) ois.readObject();
                fis.close();
                ois.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return students;
        }


    }
