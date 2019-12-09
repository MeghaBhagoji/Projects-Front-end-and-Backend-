package CheckedExceptionpkg;

public class ExceptionB 
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		try {
			Object o1=s1.clone();
			System.out.println("object is cloned");
			Class c1=Class.forName("CheckedExceptionpkg.Student");
			System.out.println("class  found");
		} 
		catch (CloneNotSupportedException e) 
		{
				System.out.println("clone not supported");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}
}
