public class DemoBoxWeight {
	public static void main(String args[]) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();
		
		plainbox = weightbox;
		vol = plainbox.volume(); // OK, volume() defined in Box
		
		System.out.println("Volume of plainbox is " + vol);
	  //System.out.println("Weight of plainbox is " + plainbox.weight);
		
		BoxWeight Box1= new BoxWeight(weightbox,12);
		System.out.println(Box1.weight);
		System.out.println(Box1.mat);
		
	}
}