//Multi Level Inheritance using example University College and Department
package inheritance;
//Multi level Inheritance
public class University 
{
	String uName;
	String uType;
	String vc;
	String uLoc;
	int code;
	
	public University() 
	{
		super();
	}
	University(String uName,String uType,String vc,String uLoc,int code)
	{
		super();
		this.uName=uName;
		this.uType=uType;
		this.vc=vc;
		this.uLoc=uLoc;
		this.code=code;
	}
	public void displayUniversity()
	{
		System.out.println("University Name : "+uName);
		System.out.println("University Type : "+uType);
		System.out.println("Voice chancellor : "+vc);
		System.out.println("University Location : "+uLoc);
		System.out.println("University Code : "+code);
		System.out.println("-----------------------------------");
	}

}
//--------------------------------------------------------------------------------------
package inheritance;
//Multi level Inheritance
public class College extends University
{
	String collName;
	String principal;
	String address;
	int collCode;
	int grade;
	int noOfDepts;
	
	public College() 
	{
		super();
	}
	College(String uName,String uType,String vc,String uLoc,int code,String collName,String principal,String address,
			int collCode,int grade,int noOfDepts)
	{
		super(uName,uType,vc,uLoc,code);
		
		this.collName=collName;
		this.principal=principal;
		this.address=address;
		this.collCode=collCode;
		this.grade=grade;
		this.noOfDepts=noOfDepts;
		
	}
	public void displayCollege()
	{
		displayUniversity();
		System.out.println("College Name : "+collName);
		System.out.println("Principal : "+principal);
		System.out.println("College Address : "+address);
		System.out.println("College Code : "+collCode);
		System.out.println("Grade : "+grade);
		System.out.println("No of Departnents : "+noOfDepts);
		System.out.println("---------------------------------");
	}

}
//------------------------------------------------------------------------------
package inheritance;
//Multi level Inheritance
public class Department extends College
{
	String type;
	String hod;
	int lec;
	int noOfStudents;
	int seats;
	
	public Department() 
	{
		super();
	}
	Department(String uName,String uType,String vc,String uLoc,int code,String collName,String principal,String address,
			int collCode,int grade,int noOfDepts,String type,String hod,int lec,int noOfStudents,int seats)
	{
		super(uName,uType,vc,uLoc,code,collName,principal,address,collCode,grade,noOfDepts);
		
		this.type=type;
		this.hod=hod;
		this.lec=lec;
		this.noOfStudents=noOfStudents;
		this.seats=seats;
	}
	public void displayDepartment()
	{
		displayCollege();
		System.out.println("Type : "+type);
		System.out.println("HOD : "+hod);
		System.out.println("Lecturer : "+lec);
		System.out.println("Students Count : "+noOfStudents);
		System.out.println("Seats : "+seats);
	}

}
//---------------------------------------------------------------------------------
package inheritance;
//Multi level Inheritance
public class UniversityDriver 
{
	public static void main(String[] args) 
	{
		Department d1=new Department("SPPU","Technological","Suresh Gosavi","Pune",4093,"APCOER",
				"Sunil Thakare","Pune",4568,2,7,"CS","Kalal",20,300,300);
		
		d1.displayDepartment();
	}

}
