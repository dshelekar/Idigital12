package Day2;


public class OverlAdd{
public int add(int a , int b){
       return (a + b);
}
public int add(int a , int b , int c){
       return (a + b + c) ;
}
public double add(double a , double b){
       return (a + b);
}
public static void main( String args[]){
	OverlAdd ob = new OverlAdd();
ob.add(15,25);
ob.add(15,25,35);
ob.add(11.5 , 22.5);
}
}