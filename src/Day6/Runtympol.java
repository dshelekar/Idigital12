package Day6;

class A3
{
	public void show()
	{
		System.out.println("A3");
	}}
	class B3 extends A3{
	public void show()
	{
		System.out.println("B3");
	}}
	

public class Runtympol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//A3 obj=new B3();//reffer a as obj b
		A3 obj=new A3();
			obj.show();
			
			
			
			obj=new B3();
			obj.show();
			//Computer obi=new Laptop();
					
	}

}
