/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

/**
 *
 * @author sjcet
 */
import java.util.*;
public class Arraysort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit ");
        n=s.nextInt();
        String[] ar=new String[n];
        System.out.println("Enter the strings ");
        for(int i=0;i<n;i++)
        {
            ar[i]=s.next();
        }
        System.out.println("\nBefore sortin the Strings are");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
        String temp;
        for(int i=0;i<n;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                if (ar[i].compareTo(ar[j]) > 0) 
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                   ar[j] = temp;
                }
            }
        }
        System.out.println("\nAfter sortin the Strings are");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
        
        // TODO code application logic here
    }
    
}
