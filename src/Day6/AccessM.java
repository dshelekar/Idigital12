package Day6;

public class AccessM {
	int a=10;
	int b=5;
	public void add()
	{
		System.out.println("Add" +(a+b));
	}
	protected void sub()
	{
		System.out.println("sub" +(a-b));
	}
	 void multi()
	{
		System.out.println("multi" +(a*b));
		
	}
	private void div()
	{
		System.out.println("div" +(a/b));
	}

	public static void main(String[] args) {
		
		AccessM obj=new AccessM();
		obj.div();
		obj.multi();
		obj.sub();
		obj.add();
				
		
		
		
		
		// TODO Auto-generated method stub

	}

}
