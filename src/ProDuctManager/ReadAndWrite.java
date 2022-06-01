package ProDuctManager;

import CopyPasteStudentList.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWrite implements Serializable {
    public void writeToFile (List<Product> products)  {
        try {
            FileOutputStream file = new FileOutputStream("D:\\00. Codegym\\02. Module 2\\17. IO Binary File and Serialization\\IO_Binary_File_and_Serialization\\src\\ProDuctManager\\ProductList.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(products.toString());
            objectOutputStream.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(){
        List<Product> products1 = new LinkedList<>();
        try {
            FileInputStream fis = new FileInputStream("D:\\00. Codegym\\02. Module 2\\17. IO Binary File and Serialization\\IO_Binary_File_and_Serialization\\src\\ProDuctManager\\ProductList.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products1 = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products1;
    }


}
