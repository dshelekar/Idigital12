package Day6;

class A1
{
	public A1()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("show");
	}
}

public class Annonymous1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int marks;//declaring variable
		marks=99;
		A1 obj; //this is refrence
		obj=new A1();
		obj.show();*/
		
		new A1().show();//annonymous object  object dont have name

	}

}
//camel  casing
//class interfaces  capital letter - Calc
//variable and method -small letter
///consatants = all  captial -PIC
//showMyWorks()