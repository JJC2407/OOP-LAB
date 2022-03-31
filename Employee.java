/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
    int id;
    String name;
    float sal;

    Employee(int a,String b,float c) {
        id=a;
        name=b;
        sal=c;   
    }
    public void disp()
    {
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        float s=(sal)+(sal*20)/100;
        System.out.println("Salary = "+s);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e=new Employee(100,"abc",2000);
        e.disp();
        Employee e1=new Employee(101,"xyz",3000);
        e1.disp();
        // TODO code application logic here
    }
    
}
