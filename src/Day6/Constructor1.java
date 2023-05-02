package Day6;


class Constructor1
{
	private int age;//age is instance variable
	private String name;
	public Constructor1()//default
	{
		age=15;
		name="divya";
		System.out.println("constructor");
	}
	public Constructor1(int a, String n)//parametrizisd
	{
		age=a;
		name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
	//a is local variable {
		age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 obj=new Constructor1();
		Constructor1 obj1=new Constructor1(19,"riya");
		System.out.println(obj.getAge()+":"+obj.getName());
		System.out.println(obj1.getAge()+":"+obj1.getName());
		//obj.setAge(30);
		//obj.setName("navin");
		//System.out.println(obj.getAge()+" :"+obj.getName());
	}

}
