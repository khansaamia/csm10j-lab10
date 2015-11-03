package unchecked;

public class UncheckedExceptions {

	public static void ThrowIndexOutOfBounds()
	{
		int intArray[]=new int[10];
		
		System.out.println(intArray[10]);
		
	}
	
	public static void CatchIndexOutOfBounds()
	{
		try
		{
			int intArray[]=new int[10];
		
			System.out.println(intArray[10]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Caught ArrayIndexOutOfBounds");
		}
	}

	public static void CatchIndexOutOfBoundsFinally()
	{
		try
		{
			int intArray[]=new int[10];
		
			System.out.println(intArray[10]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Caught ArrayIndexOutOfBounds");
		}
		finally
		{
			System.out.println("Finally statement executed");
		}
	}

}
