package throwCustomClassException;

public class Test {
	
	public void m1(int age) throws AgeInvalidException
	{
		System.out.println("m1---start");
		if(age<0)
		{
			AgeInvalidException e=new AgeInvalidException("Age Problem");
			throw e;
		}
		System.out.println("m1---end");
	}
	public static void main(String[] args) {
		System.out.println("main---start");
		Test t=new Test();
		try {
			t.m1(-4);
			
		}
		catch (AgeInvalidException e) {
		System.out.println("Catch---Block "+e.getMessage());
		}
		System.out.println("main--End");
	}

}
