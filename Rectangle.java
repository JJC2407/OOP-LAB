/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int a,b;

    Rectangle(int x,int y) {
        a=x;
        b=y;
    }
    public void disp()
    {
        System.out.println("Area of rectangle is "+a*b);
        System.out.println("Perimeter of rectangle is "+2*(a+b));
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,2);
        r.disp();
        Rectangle r1=new Rectangle(5,2);
        r1.disp();
        
        // TODO code application logic here
    }
    
}
