
public abstract class duck {

	public QuackBehavior quackbehavior;
	public flyBehavior Flybehavoir;
	public duck()
	{}
	
	public void performQuack()
	{
		quackbehavior.quack();
		
	}
	public void performfly(){
		Flybehavoir.fly();
	}
	
	public void changFlyAbility( flyBehavior canfly)
	{
		this.Flybehavoir= canfly;
	}
	public void changeQuack( QuackBehavior sound)
	{
		this.quackbehavior=sound;
	}
	
}
