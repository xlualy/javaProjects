
public class Executable {

	public static void main (String args[])
	{
		RedDresses dress = new RedDresses();
		User cus1=new User(dress);
	
		dress.stockStatus(true);
	}
}
