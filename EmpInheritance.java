package person;
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
class Employee{
    int empid,salary;
    String ename,address;
    Employee(int id,String name,int s,String Add){
        
        empid=id;
        ename=name;
        salary=s;
        address=Add;
        
        
    }
    
}

class Teacher extends Employee{
    String department,subject;
    
    Teacher(int id,String name,int s,String Add,String dep,String sub){
        
        super(id,name,s,Add);
        department=dep;
        subject=sub;
        
        
        }
    public void display(){
        
        System.out.println("\n Empid : "+empid);
        System.out.println(" name : " +ename );
        System.out.println(" salary : " +salary);
        System.out.println(" Address: " +address);
        System.out.println(" department: " +department);
        System.out.println(" subject: " +subject);
    }
}

public class EmpInheritance {

    
    public static void main(String[] args) {
        int n;
        int id,salary;
        String name,address,dep,sub;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no of teacher");
        n=sc.nextInt();
        
        Teacher t[]=new Teacher[n];
        
        for(int i=0;i<n;i++){
            
            System.out.println("\n Enter the employee id");
            id=sc.nextInt();
            System.out.println("Enter the name");
            name=sc.next();
            System.out.println("Enter salary");
            salary=sc.nextInt();
            System.out.println("Enter Address");
            address=sc.next();
            System.out.println("Enter department");
            dep=sc.next();
            System.out.println("Enter subject");
            sub=sc.next();
            
            t[i]=new Teacher(id,name,salary,address,dep,sub);
         
            
        }
        System.out.println("\n Employee details:");
        for(int i=0;i<n;i++){
            t[i].display();
        }
            
       
    }
    
}
