package Day1;


class Factorial{  
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}

/*
 
public class FactorialLoop {
    public static void main(String args[]) {
        int num, factorial = 1, i;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = in.nextInt();
         
        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }
         
        System.out.println("!" + num + " = " + factorial);
    }
}*/