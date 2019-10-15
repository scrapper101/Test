/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
/**
 *
 * @author Paul'srobot
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i,j;
       for (i=0;i<17 ;i++)
       {
           if(i==0 || i==16)
               System.out.println("************"); //for 1st and last row
           else if (i%2==0)
               System.out.println("* *"); //for middle row
           else
               System.out.println("");
       }
         
       for(i=0;i<3;i++)
       {
           if(i==0)
               System.out.println(" *** \n"); //first row
           j=5-i;
           while(j-->0)
               System.out.print(" "); //space printing in middle rows
           System.out.print("*"); //print astrick
           j=10 + i*2;
           while(j-->0)
               System.out.print(" "); //space printing betweeb astrick in each row
           System.out.print("* ");

System.out.println("\n");         
          
                 
       }
         
       for(i=3;i>0;i--)
       {
             
           j=5-i;
           while(j-->0)
               System.out.print(" ");
           System.out.print("*");
           j=10 + i*2;
           while(j-->0)
               System.out.print(" "); //space printing betweeb astrick in each row
           System.out.print("* ");

System.out.println("\n");         
if(i==1)
               System.out.println(" *** \n");         
                 
       }
         
         
       for(i=0;i<17;i++)
       {
           if(i<3)
           {
               j=2-i;
               while(j-->0)
                   System.out.print(" ");
                 
               j=2*i+1;
               while(j-->0)
               System.out.print("*");//for First 3 rows
           System.out.println();
           }
           else
           {
               j=2;
               while(j-->0)
                   System.out.print(" ");
               System.out.println("*");
           }
             
          
       }
         
       System.out.println(" *"); //First row
         
       //first 3 rows
       for(i=0;i<3;i++)
       {
             
           j=4-i;
           while(j-->0)
               System.out.print(" ");
           System.out.print("*");
           j=2*i+1;
           while(j-->0)
               System.out.print(" ");
           System.out.print("*");
             
           System.out.println("\n");     
       }
         
       //last 4 rows
       for(i=3;i>=0;i--)
       {
             
           j=4-i;
           while(j-->0)
               System.out.print(" ");
           System.out.print("*");
           j=2*i+1;
           while(j-->0)
               System.out.print(" ");
           System.out.print("*");
             
           System.out.println("\n");     
       }
       System.out.println(" *");
        
       
       //Question number 2, Enter an integer
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter an integer");
       
       int varyb = input.nextInt();
       System.out.println("Enter varibale c");
       
       int varyc = input.nextInt();
       
       // Assigning the product of variables b and c to variable a
       System.out.println("The prodcut of variable b and c is: " + varyb * varyc);
       
       
       
       // Question number 3,
       Scanner inpoot = new Scanner(System.in);
      
       System.out.println("Enter two integers");
        int vary= inpoot.nextInt();
        int e = inpoot.nextInt();
        int u = vary+ e; 
        int y = vary*e;
        int z = vary/e;
        int paul = vary-e;
        System.out.println("Addition is: " + u + " " + "Multiplication is: " + " " + y +" "+ "Division is: " + " " + z + " " + "Difference: " + paul);
        
        
       
        
    }
    
}
