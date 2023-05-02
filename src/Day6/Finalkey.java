package Day6;
final class Calc1 //final class noone can extend
{
	public final  void show()///noone can overrude
	{
		System.out.println("hii");
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Advnc extends Calc1
{
	public void show() //u will gwt error
	{
		System.out.println("hii");
	}
}
public class Finalkey {

	public static void main(String[] args) {
	
		Advnc  obj=new Advnc();
		
	}

}
/*
public class Finalkey {
final variable
public static void main(String[] args) {
	// TODO Auto-generated method stub
	final int num=8; //u caant change making constant
	num=9;
	System.out.println(num);
*/