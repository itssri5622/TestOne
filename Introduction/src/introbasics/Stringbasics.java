package introbasics;

public class Stringbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String literal as the content is same it will not create space for s2
		String s1 ="All is well" ;
		String s2= "All is well";
		
		// S3 & s4 creates new memory spaces
		String s3= new String ("God is love");
		String s4= new String ("God is love");
		
		System.out.println(s1 + s2+ s3+ s4);
		System.out.println("**************");
		
		String s5[]= s1.split(" ");
		for(int i=0;i<s5.length;i++)
		{
			System.out.println(s5[i]);
		}
		
		}

}
