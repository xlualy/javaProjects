
public class Simulator {

	public static void main(String args[])
	{
		duck mallard= new mallardDuck();
		mallard.performQuack();
		mallard.performfly();
		mallard.changFlyAbility(new flyRocketPowered());
		mallard.performfly();
	
	}
}
