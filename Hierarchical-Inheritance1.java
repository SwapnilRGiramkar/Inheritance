//Heirarchical Inheritance example
package inheritance;
//Hierarchical Inheritance
public class Google 
{
	String ceo;
	String hq;
	double turnover;
	
	String email;
	String pass;
	
	public Google() {
		// TODO Auto-generated constructor stub
	}
	Google(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	public void login(String email,String pass)
	{
		if(this.email==email && this.pass==pass)
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Invalid Credintials");
		}
	}
	public void displayGoogle()
	{
		System.out.println("CEO : "+ceo);
		System.out.println("Head Quarter : "+hq);
		System.out.println("Turn Over : "+turnover);
		System.out.println("----------------------------------");
	}
}
//----------------------------------------------------------------------------------------
package inheritance;

public class Gmail extends Google 
{
	int inbox;
	int sent;
	int mails;
	int bin;
	
	public Gmail() {
		// TODO Auto-generated constructor stub
	}
	Gmail(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void sendMail(String email,String content)
	{
		sent++;
		System.out.println("MAil Send successfully");
	}
	public void receiveMial(String email,String content)
	{
		System.out.println("Receive mail Successfully from : "+email);
		System.out.println(content);
		mails++;
		inbox++;
		
	}
	public void deleteMail(String email)
	{
		inbox--;
		bin++;
		System.out.println("delete mail Successfully");
	}
	public void displayGmail()
	{
		displayGoogle();
		System.out.println("Total Mails : "+mails);
		System.out.println("Sent Mails : "+sent);
		System.out.println("deleted Mails : "+bin);
		System.out.println("Inbox : "+inbox);
		System.out.println("------------------------------");
	}
}
//------------------------------------------------------------------------------------
package inheritance;

public class GoogleDrive extends Google
{
	int photo;
	int vedios;
	int docs;
	int audio;
	int bin;
	
	public GoogleDrive() {
		// TODO Auto-generated constructor stub
	}
	
	GoogleDrive(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void add(String filetype)
	{
		switch (filetype) 
		{
		case "photo": 
		case "Photo":
		{	
			System.out.println("Photoe added");
			photo++;
		}
		break;
		case "vedios": 
		case "Vedios":
		case "vedio":
		{	
			System.out.println("Vedios added");
			vedios++;
		}
		break;
		case "docs": 
		case "Docs":
		{	
			System.out.println("Docs added");
			docs++;
		}
		break;
		case "audio": 
		case "Audio":
		case "audios":
		{	
			System.out.println("Audio added");
			audio++;
		}
		break;
		default:
			System.out.println("Invalid Filetype");
		}
	}

	//---------------------------------------------------------------
	public void delete(String filetype)
	{
		switch (filetype) 
		{
		case "photo": 
		case "Photo":
		{	
			System.out.println("Photoe deleted");
			photo--;
			bin++;
		}
		break;
		case "vedios": 
		case "Vedios":
		case "vedio":
		{	
			System.out.println("Vedios addeletedded");
			vedios--;
			bin++;
		}
		break;
		case "docs": 
		case "Docs":
		{	
			System.out.println("Docs deleted");
			docs--;
			bin++;
		}
		break;
		case "audio": 
		case "Audio":
		case "audios":
		{	
			System.out.println("Audio deleted");
			audio--;
			bin++;
		}
		break;
		default:
			System.out.println("Invalid Filetype");
		}
	}
	
	public void displayDrive()
	{
		System.out.println("Photoes: "+photo);
		System.out.println("Vedios : "+vedios);
		System.out.println("Audios : "+audio);
		System.out.println("Documents : "+docs);
		System.out.println("Deleted : "+bin);
		System.out.println("-------------------------------------------");
	}

}
//-------------------------------------------------------------------------------
package inheritance;

public class GoogleDrive extends Google
{
	int photo;
	int vedios;
	int docs;
	int audio;
	int bin;
	
	public GoogleDrive() {
		// TODO Auto-generated constructor stub
	}
	
	GoogleDrive(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void add(String filetype)
	{
		switch (filetype) 
		{
		case "photo": 
		case "Photo":
		{	
			System.out.println("Photoe added");
			photo++;
		}
		break;
		case "vedios": 
		case "Vedios":
		case "vedio":
		{	
			System.out.println("Vedios added");
			vedios++;
		}
		break;
		case "docs": 
		case "Docs":
		{	
			System.out.println("Docs added");
			docs++;
		}
		break;
		case "audio": 
		case "Audio":
		case "audios":
		{	
			System.out.println("Audio added");
			audio++;
		}
		break;
		default:
			System.out.println("Invalid Filetype");
		}
	}

	//---------------------for deletion------------------------------------------
	public void delete(String filetype)
	{
		switch (filetype) 
		{
		case "photo": 
		case "Photo":
		{	
			System.out.println("Photoe deleted");
			photo--;
			bin++;
		}
		break;
		case "vedios": 
		case "Vedios":
		case "vedio":
		{	
			System.out.println("Vedios addeletedded");
			vedios--;
			bin++;
		}
		break;
		case "docs": 
		case "Docs":
		{	
			System.out.println("Docs deleted");
			docs--;
			bin++;
		}
		break;
		case "audio": 
		case "Audio":
		case "audios":
		{	
			System.out.println("Audio deleted");
			audio--;
			bin++;
		}
		break;
		default:
			System.out.println("Invalid Filetype");
		}
	}
	
	public void displayDrive()
	{
		System.out.println("Photoes: "+photo);
		System.out.println("Vedios : "+vedios);
		System.out.println("Audios : "+audio);
		System.out.println("Documents : "+docs);
		System.out.println("Deleted : "+bin);
		System.out.println("-------------------------------------------");
	}

}
//-----------------------------------------------------------------------------------------
package inheritance;

public class GoogleDriver 
{
	public static void main(String[] args) 
	{
		Gmail g1= new Gmail("Sundar Picahi","San Francisco", 30122218735000.0, "raju@gmail.com", "Raju@123");
		
		g1.displayGmail();
		g1.displayGoogle();
		g1.login("raju@gmail.com", "Raju@123");
		
		g1.sendMail("rani@gmail.com", "Hello..! i am rani");
		g1.displayGmail();
		
		GoogleDrive g2=new GoogleDrive("Sundar Picahi","San Francisco", 30122218735000.0, "rani@gmail.com", "Rani@123");
		g2.displayDrive();
		g2.add("Photo");
		g2.displayDrive();
		g2.add("vedios");

		g2.delete("Photo");
		g2.displayDrive();
	}

}
//--------------------------------------------------------------------------------------------------------------------------
