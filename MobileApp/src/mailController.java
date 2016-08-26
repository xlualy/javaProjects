import java.util.ArrayList;


public class mailController implements Application {

	private String googEmail;
	private String yahooEmail;
	
	private ArrayList<user> users;
	
	
	public mailController(){
	users= new ArrayList<user>();
		
	}
	
	public void emailSend(user newUser) {
		users.add(newUser);
		
	}
	public void deleteEmail(user u) {
	   int ID= users.indexOf(u);
	   System.out.println("The mail of sender:"+(ID++)+"has deleted");
	   users.remove(ID);
	   
		
	}
	public void notifyEmail() {
		for(user userr:users )
		{
			userr.updateEmail(googEmail, yahooEmail);
		}
	}
	public void receiveGmail( String mail)
	{
		this.googEmail=mail;
		notifyEmail();
	}
	public void receiveYmail( String mail)
	{
		this.yahooEmail=mail;
		notifyEmail();
	}
}