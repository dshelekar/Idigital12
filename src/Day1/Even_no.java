package Day1;

import java.util.Scanner;

public class Even_no {

public static void main(String args[])   
{  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("List of even numbers from 1 to n: ");  
for (int i=1; i<=n; i++)   
{  
//logic to check if the number is even or not  
//if i%2 is equal to zero, the number is even  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}  