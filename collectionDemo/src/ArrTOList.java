import java.util.*;

public class ArrTOList {

	/**
	 * @Arraylist to array
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ini= new ArrayList<Integer>();
		
		ini.add(3);
		ini.add(5);
		ini.add(4);
		ini.add(6);
		
		int sum=0;
		Integer[] ai= new Integer[ini.size()];
		ai=ini.toArray(ai);
		
		for(Integer i:ai){   //can be written as for(int i
			sum=sum+i;		// as java can autobox it into its prmitive type	
		}
		
		System.out.println(sum);
	}

}
