package introbasics;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m1= new Methods();
		m1.add();
		sub();

	}
 public void add()
 {
	 int a = 0,b=5;
	 int c;
	 c= a+b;
	 System.out.println(c);
 }
 public static void sub()
 {
	 System.out.println("No need to create class object for static");
	 int a = 10,b=5;
	 int c;
	 c= a-b;
	 System.out.println(c);
 }
}
