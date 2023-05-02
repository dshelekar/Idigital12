package Day1;

import java.util.Scanner;

public class PositiveNt {

    public static void main( String args[] ) {
        // create some number values
        
       Scanner sc=new Scanner(System.in);
       System.out.println(" Enter value");
       
       int a=sc.nextInt();
    		   
    		   if (a==0)
    		   {
    			   System.out.println("zero");
    		   }
    		   else 
    		   {
    			   if(a<0)
    			   {
    				   System.out.println("negative");
    			   }
    			   else if(a>0)
    			   {
    				   System.out.println("positive");
    			   }
    		   }
    }
}