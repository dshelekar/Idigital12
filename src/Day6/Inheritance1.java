package Day6;
class Calc
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}

	public int sub(int n1,int n2)
	{
		return n1-n2;
	}}
	class advnced extends Calc
	{
		public int mul(int n1,int n2)
		{
			return n1*n2;
		}

		public int div(int n1,int n2)
		{
			return n1/n2;
		}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Calc obj=new Calc();
			//int r1=obj.add(9, 8);
			//int r2=obj.add(9, 8);
		advnced obj=new advnced();
		int r1=obj.add(9, 8);
		int r2=obj.add(9, 8);
		int r3=obj.add(7, 8);
		int r4=obj.add(15, 5);
		System.out.println(r1+" "+r2+" "+r3+" "+r4);
		
		
			
	}

}
