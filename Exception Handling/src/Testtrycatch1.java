
public class Testtrycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int data=50/0;
}
catch(ArithmeticException ae)
{
	System.out.println(ae);
}
System.out.println("rest of the code...");
	}

}
