/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,m,n,p,q;
        Scanner s=new Scanner(System.in)
        System.out.println(" Martrix-1\n-----------");
        System.out.println("Enter the no.of rows and coloumn : ");
        m=s.nextInt();
        n=s.nextInt();
        System.out.println(" Martrix-2\n-----------");
        System.out.println("Enter the no.of rows and coloumn : ");
        p=s.nextInt();
        q=s.nextInt();
        if(m==p && n==q)
        {
            int a[][]=new int[m][n];
            int b[][]=new int[p][q];
            System.out.println("Enter the elments matrix-1");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the elments matrix-2");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j]=s.nextInt();
                }
            }
            System.out.println("\n Matrix-1 \n-----------");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("\n Matrix-2 \n-----------");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("\n Matrix-1 + Matrix-2\n---------------------");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+b[i][j]+"\t");
                }
                System.out.println("\n");
            }
        }
        
        
        
        // TODO code application logic here
    }
    
}
