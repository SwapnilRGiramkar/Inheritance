//Meta facebook and insta example of Hierarchical Inhereitance
package inheritance;

public class Meta 
{
	String ceo;
	String hq;
	double turnover;
	
	String email;
	String pass;
	
	
	public Meta() {
		// TODO Auto-generated constructor stub
	}
	
	Meta(String ceo,String hq,double turnover,String email,String pass)
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
			System.out.println("Invalid Credintials..!");
		}
	}
	public void displayMeta()
	{
		System.out.println("CEO : "+ceo);
		System.out.println("HeadQuarter : "+hq);
		System.out.println("Turn Over : "+turnover);
		System.out.println("-----------------------------------------");
	}
}
//---------------------------------------------------------------------------------
package inheritance;

public class Facebook extends Meta
{
	int reels;
	int post;
	int archieve;
	int save;
	int bin;
	
	public Facebook() {
		// TODO Auto-generated constructor stub
	}
	
	Facebook(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void addPost(String email,int post)
	{
		post++;
		System.out.println("Post send Succesfully ");
	}
	
	public void deletePost(String email)
	{
		if(this.email==email)
		{
			post--;
			System.out.println("delete post Succesfully");
		}
		else
			System.out.println("Invalid Credentials");
	}
	
	public void archievePost(String email)
	{
		archieve++;
		System.out.println("Archieve post Successfully ");
	}
	public void addReel(String email)
	{
		reels++;
		save++;
		System.out.println("reel added success");
	}
	public void deleteReel(String email)
	{
		if(this.email==email)
		{
			reels--;
			save--;
			bin++;
			System.out.println("delete reel succeess");
		}
		else
			System.out.println("Invalid Credentials");
		
	}
	
	public void displayFacebook()
	{
		System.out.println("Reels : "+reels);
		System.out.println("Post : "+post);
		System.out.println("Archieve : "+archieve);
		System.out.println("Save : "+save);
		System.out.println("Bin : "+bin);
		System.out.println("-----------------------------------");
	}
}
//---------------------------------------------------------------------------------
package inheritance;

public class Insta extends Meta
{
	int reels;
	int post;
	int archieve;
	int save;
	int bin;
	
	public Insta() {
		// TODO Auto-generated constructor stub
	}
	
	Insta(String ceo,String hq,double turnover,String email,String pass)
	{
		this.ceo=ceo;
		this.hq=hq;
		this.turnover=turnover;
		this.email=email;
		this.pass=pass;
	}
	
	public void addPosts(String email)
	{
		post++;
		System.out.println("Post send Succesfully ");
	}
	
	public void deletePosts(String email)
	{
		if(this.email==email)
		{
			post--;
			System.out.println("delete post Succesfully");
		}
		else
		{
			System.out.println("Invalid Creditntials");
		}
	}
	
	public void archievePosts(String email)
	{
		archieve++;
		System.out.println("Archieve post Successfully ");
	}
	public void addReels(String email)
	{
		reels++;
		save++;
		System.out.println("reel added success");
	}
	public void deleteReels(String email)
	{
		if(this.email==email)
		{
			reels--;
			save--;
			bin++;
			System.out.println("delete reel succeess");
		}
		else
			System.out.println("Invalid credentials");
	}
	
	public void displayInsta()
	{
		System.out.println("Reels : "+reels);
		System.out.println("Post : "+post);
		System.out.println("Archieve : "+archieve);
		System.out.println("Save : "+save);
		System.out.println("Bin : "+bin);
		System.out.println("-------------------------------");
	}
}

//------------------------------------------------------------------
package inheritance;

public class MetaDriver 
{
	public static void main(String[] args) 
	{
		//Meta m1=new Meta("swapnil","Pune", 235685445355.0, "swap@gmail.com","Swap@123");
		Facebook f1=new Facebook("swapnil","Pune", 235685445355.0, "swap@gmail.com","Swap@123");
		f1.displayFacebook();
		f1.displayMeta();
		f1.login("swap@gmail.com", "Swap@123");
		f1.addPost("swapnil@123", 1);
		f1.deletePost("swajhp@123");
		
		Insta i=new Insta("Neil","Pune", 235685445355.0, "neil@gmail.com","N@123");
		i.displayInsta();
		i.addPosts("swap@123");
		i.displayInsta();
		i.deletePosts("neil@gmail.com");
		i.displayInsta();
	}

}

