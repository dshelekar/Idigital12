package Practice22;

interface  Class{

	void display();
	
}
class student implements Class
{
	public void  display()
	{
		System.out.println("student class");
	}
}
class Lecture implements Class
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" lecture ");
	}
}

public class AabstractionEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class obj=new student();
		obj.display();
		
	}

}
