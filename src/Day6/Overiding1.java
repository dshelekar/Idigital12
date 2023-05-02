package Day6;
class A2
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	
}
class B2 extends A2
{

	public int add(int n1,int n2)
	{
		return n1+n2+1;
	}

}

public class Overiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B2 obj=new B2();
			//obj.show();
			//obj.config();
			int r1=obj.add(3, 4);
			System.out.println(r1);
	}

}
/* package VdPrac;
class A2
{
	public void show()
	{
		System.out.println("show a");
	}
	public void config()
	{
		System.out.println("config");
	}
}
class B2 extends A2
{
	public void show()
	{
		System.out.println("show b");
	}
}

public class Overiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B2 obj=new B2();
			obj.show();
			obj.config();
	}

}
*/