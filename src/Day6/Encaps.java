package Day6;
class Human
{ // if i dont wnat value i wnat set
	private int age;
	private String name;
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public void setName(String n)
	{
		name=n;
	}
}
public class Encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.setAge(30);
		obj.setName("navin");
		System.out.println(obj.getAge()+" "+obj.getName());
	}

}
/*
class Human
{
	private int age=11; //if u make it private none can acces
	private String name="Navin";
	public int getAge()
	{
		return age;
	}
}
public class Encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		obj.age=11;
		obj.name="Navin";
		System.out.println(obj.name);
	}

}vclass Human //for getting the vale
{
	private int age=11;
	private String name="Navin";
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
}
public class Encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Human();
		//obj.age=11;
		//obj.name="Navin";
		System.out.println(obj.getAge()+" "+obj.getName());
	}

}

*/