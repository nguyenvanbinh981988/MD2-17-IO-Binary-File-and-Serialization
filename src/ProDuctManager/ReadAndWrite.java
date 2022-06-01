package ProDuctManager;

import CopyPasteStudentList.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWrite {
    public void writeToFile (List<Product> products)  {
        try {
            FileOutputStream file = new FileOutputStream("ProductList.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(){
       List<Product> products = new LinkedList<>();
        try {
            FileInputStream fis = new FileInputStream("ProductList.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (LinkedList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }


}
