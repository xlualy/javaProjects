package VU;

import java.util.*;
import javax.swing.*;
public class menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AddressBook ad= new AddressBook();
		
		while(true){
			String input = JOptionPane.showInputDialog("Enter your choice \n 1.Add name \n 2.Search \n 3.Delete \n 4.Exit");
			char in=input.charAt(0);
			switch(in){
			case '1':
				ad.addPerson();
				break;
			case '2':
				String n= JOptionPane.showInputDialog(null,"Enter to search");
				ad.searchPerson(n);
				break;
			case '3':
				String n1= JOptionPane.showInputDialog(null,"Enter name to Delete");
				ad.DelPerson(n1);
				break;
			case '4':
				ad.savePerson();
				System.exit(0);
				break;
			case '5':
				ad.allDetails();
				break;	
			default:
				System.out.println("Invalid option");
			}
		}

	}

}
