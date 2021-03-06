import java.util.ArrayList;


public class RedDresses implements Observable {

	private boolean inStock;
	private ArrayList<Observer> observers;
	
	public RedDresses(){
		observers= new ArrayList<Observer>();
		
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		int uIndex=observers.indexOf(o);
		System.out.println("The user of Id "+(uIndex++)+" has removed");
		observers.remove(uIndex);
		
	}

	public void notifyObserver() {
		for(Observer Obs:observers)
		{
			Obs.update(inStock);
		}
		
	}
	
	public void stockStatus(boolean avaliablity)
	{
		this.inStock=avaliablity;
		notifyObserver();
	}

}
