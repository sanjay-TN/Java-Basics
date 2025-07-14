package day18.CheckedExcepions;
 // checked exceptions are handled using---
//1) try catch
//2) throws


public class HandlingChecked {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.out.println("hello2");
//		try
//		{
//		Thread.sleep(5000);// to pause execution 5 second and after that continue execution
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		Thread.sleep(5000);
		System.out.println("hello3");
		System.out.println("hello4");
		
	}

}
