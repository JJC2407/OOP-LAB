/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {
    int m1,m2,m3;
    Student(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void total()
    {
        int s=m1+m2+m3;
        System.out.println("Total mark ="+s);
    }
    public void per()
    {
        float p=((m1+m2+m3)*100/150);
        System.out.println("Percentage = "+p);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student(10,20,30);
        s1.total();
        s1.per();
        Student s2=new Student(30,20,12);
        s2.total();
        s2.per();
        // TODO code application logic here
    }
    
}
