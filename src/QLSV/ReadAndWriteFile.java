package QLSV;

import java.io.*;
import java.util.List;

public class ReadAndWriteFile {
    public List<Student> readFileStudent(List<Student> students){
        try {
            File file = new File("StudentsList.csv");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String str = bufferedReader.readLine();
            students.clear();
            while (str != null) {
                String[] arr = str.split(",");
                String stt = arr[0];
                String name = arr[1];
                String age = arr[2];
                String birth = arr[3];
                String phone = arr[4];
                String address = arr[5];


                Student stu = new Student(stt,name,age,birth,phone,address);
                students.add(stu);
                str = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }




    public void writeFileStudents(List<Student> students) {
        File file = new File("StudentsList.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Student st : students) {
                bufferedWriter.write(st.write());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
