package ProDuctManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    Scanner input = new Scanner(System.in);
    List<Product> products = new LinkedList<>();
    ReadAndWrite readAndWrite = new ReadAndWrite();

    {products = readAndWrite.readDataFromFile();}


    public void menu(){

        try {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Show Product");
            System.out.println("3. Find Product");
            System.out.println("4. Exit");


            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addProduct(){
        System.out.println("Enter ProductID");
        String Id = input.nextLine();
        System.out.println("Enter ProductName");
        String name = input.nextLine();
        System.out.println("Enter Maker");
        String maker = input.nextLine();
        System.out.println("Enter Price");
        String Price = input.nextLine();

        Product product = new Product(Id,name,maker,Price);


        products.add(product);

        readAndWrite.writeToFile(products);
    }

    public void showProduct(){
        System.out.println("this is ProductList");
        for (Product p:products) {
            System.out.println(p.toString());
        }
    }

    public void findProduct(){
        System.out.println("Enter FindName");
        String name = input.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getProductName())){
                System.out.println(products.get(i).toString());
            }
        }
    }
}
