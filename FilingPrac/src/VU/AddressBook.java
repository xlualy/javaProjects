package VU;

import javax.swing.*;

import java.util.ArrayList;
import java.io.*;
public class AddressBook {

	ArrayList person;

	public AddressBook() {
		person = new ArrayList();
		load();
	}

	public void addPerson() {

		String name = JOptionPane.showInputDialog("Enter the name");
		String address = JOptionPane.showInputDialog("Enter the address");
		String number = JOptionPane.showInputDialog("Enter the number");

		PersonInfo p = new PersonInfo(name, address, number);

		person.add(p);

	}

	public void searchPerson(String n) {
		for (int i = 0; i < person.size(); i++) {
			PersonInfo P = (PersonInfo) person.get(i);
			if (n.equals(P.name)) {
				P.showInfo();
			}
		}
	}

	public void DelPerson(String n) {
		for (int i = 0; i < person.size(); i++) {
			PersonInfo P = (PersonInfo) person.get(i);
			if (n.equals(P.name)) {
				person.remove(i);
				
			}
		}
	}

	public void allDetails() {

		if (person.size()<0) {
			System.out.println("No contact to show");
		} else {
			for (int i = 0; i > person.size(); i++) {
					PersonInfo p= (PersonInfo)person.get(i);
					p.showall();
			}
		}
	}
	
	public void load(){
		String token[]=null;
		String name,add,ph;
		
		try{
			FileReader fr=new FileReader("test1.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			while(s!=null){
				token=s.split(",");
				name=token[0];
				add=token[1];	
				ph=token[2];
				
				PersonInfo P= new PersonInfo(name, add, ph);
				person.add(P);
				
				s=br.readLine();
				
			}
			
		 fr.close();
		 br.close();
		}catch(IOException e){
			System.out.println("Error "+e);
		}
	}
	
	public void savePerson(){
		
	  try{
		  FileWriter fr= new FileWriter("test1.txt");
		  PrintWriter pr=new PrintWriter(fr);
		  String line="";
		  for(int i=0;i<person.size();i++){
			  PersonInfo p= (PersonInfo)person.get(i);  //casting
			line=p.name+","+p.address+","+p.number; //"," will be used later in split method
			  pr.println(line);  //writing in the given distination 
		  }
		  
		  
		 
		  fr.close();
		  pr.close();
	  }catch(IOException e){
	  System.out.println("File not exist");
	  }
	}
}
