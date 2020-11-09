package tryFinallyReturn;

public class Test {
	public int m1()
	{
		System.out.println("m1---Start");
		int a=10;
		try {
			System.out.println("try---Start");
			return a;
		}
		finally {
			 a=30;
			System.out.println("Finally Block "+"a= "+a);
			return a;
		}
		
	}

	public static void main(String[] args) {
		 System.out.println("main---start");
		 Test t=new Test();
		 int x=t.m1();
		 System.out.println("main---end");
	}
}
