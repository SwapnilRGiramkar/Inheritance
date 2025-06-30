//Single level Inheritance using example of Software Engineer and developer.
//-------------------------------------------------------------------------------
package inheritance;
//Single level Inheritance
public class SoftwareEngineer
{
	String name;
	int empId;
	String compony;
	String degree;
	int exp;
	double salary;

	public SoftwareEngineer() 
	{
		super();
	}
	SoftwareEngineer(String name,int empId,String compony,String degree,int exp,double salary )
	{
		super();
		this.name=name;
		this.empId=empId;
		this.compony=compony;
		this.degree=degree;
		this.exp=exp;
		this.salary=salary;
	}
	public void displaySoftwareEngineer()
	{
		System.out.println("Name : "+name);
		System.out.println("Employee ID : "+empId);
		System.out.println("Compony : "+compony);
		System.out.println("Degree : "+degree);
		System.out.println("Experience : "+exp);
		System.out.println("Salary : "+salary);
		System.out.println("------------------------------");
	}

}
//-----------------------------------------------------------------------------------
package inheritance;
//Single level Inheritance
public class Developer extends SoftwareEngineer
{
	String teckStack;
	int project;
	String role;
	String domain;

	public Developer() 
	{
		super();
	}
	Developer(String name,int empId,String compony,String degree,int exp,double salary,
			String teckStack,int project,String role,String domain)
	{
		super(name,empId,compony,degree,exp,salary);

		this.teckStack=teckStack;
		this.project=project;
		this.role=role;
		this.domain=domain;
	}
	public void displayDeveloper()
	{
		displaySoftwareEngineer();
		System.out.println("Tech Stack : "+teckStack);
		System.out.println("Projects : "+project);
		System.out.println("Role : "+role);
		System.out.println("Domain  :"+domain);
	}

}
//------------------------------------------------------------------------------------------
package inheritance;
//Single level Inheritance
public class DeveloperDriver
{
	public static void main(String[] args) {
		Developer d1 = new Developer("Swapnil",3456,"TCS","Btech",5,100000.0,"java python",45,"Team Lead","Corporate");
		d1.displayDeveloper();
	}
}
//------------------------------------------------------------------------------------------------------
