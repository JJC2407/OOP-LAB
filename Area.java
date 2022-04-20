/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author sjcet
 */
import java.util.*;
public class Area {

    /**
     * @param args the command line arguments
     */
    static double are(double r)
    {
        return 3.14*r*r;
    }
    static int are(int a,int b)
    {
        return a*b;
    }
    static int are(int a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int l,b,s;
        double r;
        System.out.println("Enter the length and width of Rectangle : ");
        Scanner x=new Scanner(System.in);
        l=x.nextInt();
        b=x.nextInt();
        System.out.println("Enter the side length of square : ");
        s=x.nextInt();
        System.out.println("Enter the radius of Circle : ");
        r=x.nextDouble();
        System.out.println("\n Area of circle is : "+are(r));
        System.out.println("Area of Rectangle is : "+are(l,b));
        System.out.println("\n Area of Square is : "+are(s));
    }
    
}
