/*Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price. 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Product {
    int pcode,price;
    String pname;

    Product() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the product id ");
        pcode=s.nextInt();
        System.out.println("Enter the product name ");
        pname=s.next();
        System.out.println("Enter the product price ");
        price=s.nextInt();
    }
    public void disp()
    {
        System.out.println("Product code  : "+pcode);
        System.out.println("Product name  : "+pname);
        System.out.println("Product price : "+price);  
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Product - 1 \n------------");
        Product p1=new Product();
        System.out.println("Product - 2 \n------------");
        Product p2=new Product();
        System.out.println("Product - 3 \n------------");
        Product p3=new Product();
        System.out.println("\n Lowest price Product - 1 \n----------------------------------");
        if(p1.price<p2.price && p1.price<p3.price)
            p1.disp();
        else if(p2.price<p1.price && p2.price<p3.price)
            p2.disp();
        else
            p3.disp();
        // TODO code application logic here
    }
    
}
