import java.util.*;
public class Exception {
	public static void main(String[] args)
	{
	try
	{
		String a = null;
		System.out.println(a.length());
	}
	catch (NullPointerException e)
	{
		System.out.println("Null pointer exception handled: "+ e);
	}
	try {
	int[] arr= {1,2,3};
	System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutofboundexception handled: "+e);
	}
	System.out.println("Finally Executed");
	}
}
	
