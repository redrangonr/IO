package QuanLySanPham;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
   static Scanner sc = new Scanner(System.in);
  static   List<Product> products =new ArrayList<>();
    public static void main(String[] args) {


        products.add(new Product("1C50","nước hoa","chanel",900));
        products.add(new Product("QAS0","quần","D&G",120));
        products.add(new Product("12MA","mũ","Nike",300));
        writeToFile(products ,"SanPham.txt");
        readProductFile(products , "Sanpham.txt");
        intoDisplay(products);
        addProduct();
    }
    public static void writeToFile(List<Product> products,String path){
        try{
            FileOutputStream fos = new FileOutputStream("SanPham.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void intoDisplay(List<Product> products){
        for(Product list:products){
            System.out.println(list);
        }
    }
    public static void readProductFile(List<Product> products,String path){
        try{
            FileInputStream fis = new FileInputStream("SanPham.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>)ois.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public   static void addProduct(){
        System.out.println("Nhap ma san pham");
        String msp = sc.nextLine();
        System.out.println(" Nhap ten san pham");
        String name = sc.nextLine();
        System.out.println("Nhap hang");
        String hang = sc.nextLine();
        System.out.println("Nhap gia tien");
        int prime = sc.nextInt();
        products.add(new Product(msp,name,hang,prime));
    }
}
