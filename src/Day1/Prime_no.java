package Day1;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=5, a=0;
		while(i<=n)
		{
			if(n%i==0) {
				a++;
			break;
		}
		i++;

	}
	if(a==0&&n>1)
	{
		System.out.println("prime no");
	}
	else
	{
		System.out.println(" not prime");
}}}
