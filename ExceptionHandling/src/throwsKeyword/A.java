package throwsKeyword;

public class A {
	
	public void m1()
	{
		System.out.println("m1---start");
		B b=new B();
		try {
			System.out.println("try--block");
			b.m2();
		}
		catch (ArithmeticException e) {
			System.out.println("catch--block");	
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main---start");
		A a=new A();
		a.m1();
	}

}
