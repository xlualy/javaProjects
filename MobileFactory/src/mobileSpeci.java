
public class mobileSpeci {

	private double price;
	private String company;

	public void setPrice(double newPrice){
		price=newPrice;
	}
	public double getPrice(){
	return price;
	}
	
	public void setCompany(String newCompany){
		company=newCompany;
	}
	public String getCompany(){
	return company;
	}
	
	public void showCompany(){
		System.out.println("The company mafacturer is:"+getCompany());
	}
	public void showPrice(){
		System.out.println("The price of mobile is $"+getPrice());
	}
	
	
	
}
