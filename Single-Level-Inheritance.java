//Single level inheritance 
//-----------------------------------------------
package inheritance;

public class A
{
	int a=5;

	public void displayA()
	{
		System.out.println(a);
	}

}
//------------------------------------------------
package inheritance;

public class B extends A
{
	int ch='G';
	public void displayB()
	{
		System.out.println(ch);
	}
}
//--------------------------------------------------
package inheritance;

public class ABDriver
{
	public static void main(String[] args)
	{
		B b1=new B();
		System.out.println(b1.ch);
		System.out.println(b1.a);

		b1.displayA();
		b1.displayB();

		A a1=new A();
		System.out.println(a1.a);
		//System.out.println(a1.ch); CTE
		a1.displayA();
		//a1.displayB(); CTE

	}

}
//---------------------------------------------------
