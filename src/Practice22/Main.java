package Practice22;


class SumTest {
	 
    public final void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
 
    public void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
 }
 
public class Main
{
	public static void main(String[] args) {
		SumTest sumTest = new SumTest();
		sumTest.sum(10, 5);
		sumTest.sum(10, 5, 20);
	}
}
//Output

//15
//35