//Single Level Inheritance
//--------------------------------------------------------
package inheritance;
//Single level Inheritance
public class UPI
{
	String bankName;
	String userName;
	String actype;
	int accNo;
	long mob;;

	public UPI() {
		// TODO Auto-generated constructor stub
	}
	UPI(String bankName,String userName,String actype,int accNo,long mob)
	{
		this.bankName=bankName;
		this.userName=userName;
		this.actype=actype;
		this.accNo=accNo;
		this.mob=mob;
	}
	public void displayUPI()
	{
		System.out.println("Bank Name : "+bankName);
		System.out.println("User Name : "+userName);
		System.out.println("Account Type"+actype);
		System.out.println("Account No : "+accNo);
		System.out.println("Mobile no : "+mob);
		System.out.println("-------------------------");
	}

}
//-------------------------------------------------------------------------------
package inheritance;
//Single level Inheritance
public class Phonepay extends UPI
{
	String upiType;
	int earnReward;
	String upiId;
	int accs;
	String pass;
	String email;

	public Phonepay() {
		// TODO Auto-generated constructor stub
	}

	Phonepay(String bankName,String userName,String actype,int accNo,long mob,String upiType,int earnReward,String upiId,int accs,String pass,String email)
	{
		this.bankName=bankName;
		this.userName=userName;
		this.actype=actype;
		this.accNo=accNo;
		this.mob=mob;

		this.upiType=upiType;
		this.earnReward=earnReward;
		this.upiId=upiId;
		this.accs=accs;
		this.pass=pass;
		this.email=email;
	}
	public void displayPhonepay()
	{
		displayUPI();
		System.out.println("UPI Type : "+upiType);
		System.out.println("Earn Reward : "+earnReward);
		System.out.println("UPI Id : "+upiId);
		System.out.println("No of ACCs : "+accs);
		System.out.println("Password : "+pass);
		System.out.println("email : "+email);
		System.out.println("----------------------------------------");
	}

}
//-------------------------------------------------------------------------------------
package inheritance;
//Single level Inheritance
public class UPIDriver
{
	public static void main(String[] args) {
		Phonepay u1=new Phonepay("SBI","Swapnil","Savings",456987,9284094059l,"Phonepay",34,"928409@sbi",3,"Swap@123","Swap87@gmail.com");
		u1.displayPhonepay();
	}

}
//----------------------------------------------------------------------------------------------
