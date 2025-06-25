//Hierarchical Inheritance 
package inheritance;
//Hierarchical Inheritance
public class Doctor 
{
	int empId;
	double salary;
	String license;
	int exp;
	double bonus;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	Doctor(int empId,double salary,String license,int exp,double bonus)
	{
		this.empId=empId;
		this.salary=salary;
		this.license=license;
		this.exp=exp;
		this.bonus=bonus;
	}
	public void displayDoctor()
	{
		System.out.println("Doctor ID : "+empId);
		System.out.println("Doctor Salary : "+salary);
		System.out.println("License ID : "+license);
		System.out.println("Experience : "+exp);
		System.out.println("Monthly Bonus : "+bonus);
		System.out.println("---------------------------------");
	}
}
//-----------------------------------------------------------------------------
package inheritance;
//Hierarchical Inheritance
public class Cardiologist extends Doctor
{
	String name;
	String organ;
	double fees;
	int ops;
	String feedback;
	String honour;
	
	public Cardiologist() {
		// TODO Auto-generated constructor stub
	}
	Cardiologist(int empId,double salary,String license,int exp,double bonus,
			String name,String organ,double fees,int ops,String feedback,String honour)
	{
		this.empId=empId;
		this.salary=salary;
		this.license=license;
		this.exp=exp;
		this.bonus=bonus;
		
		this.name=name;
		this.organ=organ;
		this.fees=fees;
		this.ops=ops;
		this.feedback=feedback;
		this.honour=honour;
	}
	public void displayCardiologist()
	{
		displayDoctor();
		System.out.println("Name : "+name);
		System.out.println("Organ : "+organ);
		System.out.println("Fees : "+fees);
		System.out.println("Operations : "+ops);
		System.out.println("Feedback : "+feedback);
		System.out.println("Honour given  : "+honour);
		System.out.println("------------------------------------");
	}
}
//-------------------------------------------------------------------------------------
package inheritance;
//Hierarchical Inheritance 
public class Neurologist extends Doctor
{
	String name;
	String organ;
	double fees;
	int ops;
	String feedback;
	String honour;
	
	public Neurologist() {
		// TODO Auto-generated constructor stub
	}
	Neurologist(int empId,double salary,String license,int exp,double bonus,String name,
			String organ,double fees,int ops,String feedback,String honour)
	{
		this.empId=empId;
		this.salary=salary;
		this.license=license;
		this.exp=exp;
		this.bonus=bonus;
		
		this.name=name;
		this.organ=organ;
		this.fees=fees;
		this.ops=ops;
		this.feedback=feedback;
		this.honour=honour;
	}
	public void displayNeurologist()
	{
		displayDoctor();
		System.out.println("Name : "+name);
		System.out.println("Organ : "+organ);
		System.out.println("Fees : "+fees);
		System.out.println("Operations : "+ops);
		System.out.println("Feedback : "+feedback);
		System.out.println("Honour given  : "+honour);
		System.out.println("------------------------------------");
	}
}
//--------------------------------------------------------------------------------
package inheritance;
//Hierarchical Inheritance 
public class Orthopedics extends Doctor
{
	String name;
	String organ;
	double fees;
	int ops;
	String feedback;
	String honour;
	
	public Orthopedics() {
		// TODO Auto-generated constructor stub
	}
	Orthopedics(int empId,double salary,String license,int exp,double bonus,String name,String organ,
			double fees,int ops,String feedback,String honour)
	{
		this.empId=empId;
		this.salary=salary;
		this.license=license;
		this.exp=exp;
		this.bonus=bonus;
		
		this.name=name;
		this.organ=organ;
		this.fees=fees;
		this.ops=ops;
		this.feedback=feedback;
		this.honour=honour;
	}
	public void displayOrthopedics()
	{
		displayDoctor();
		System.out.println("Name : "+name);
		System.out.println("Organ : "+organ);
		System.out.println("Fees : "+fees);
		System.out.println("Operations : "+ops);
		System.out.println("Feedback : "+feedback);
		System.out.println("Honour given  : "+honour);
		System.out.println("------------------------------------");
	}
}
//---------------------------------------------------------------------------
package inheritance;

public class DoctorDriver 
{
	public static void main(String[] args)
	{
		Neurologist c1=new Neurologist(5823,5280.0,"yes",5,456.0,"Sahil","Heart",54623.0,34,"good","M.D.");
		
		c1.displayNeurologist();
	}
}

