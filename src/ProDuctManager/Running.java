package ProDuctManager;

public class Running {
    public static void main(String[] args) {
        ProductManage productManage = new ProductManage();
        while (true){
            productManage.menu();
        }
    }
}
