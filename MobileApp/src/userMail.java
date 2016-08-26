
public class userMail implements user {

	private String gmail;
	private String ymail;
	 
	private Application subject;
	public userMail(Application subject){
		this.subject=subject;
		subject.emailSend(this);
	}
	 
	public void updateEmail(String googEmail, String yahooMail) {
		this.gmail=googEmail;
		this.ymail=yahooMail;
		printMail();
	}
	
	public void printMail()
	{
		System.out.println("\n GOOGLE Mail:"+gmail+"\n Yahoo mail:"+ymail);
	}
}
