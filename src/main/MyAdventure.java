package main;

import java.util.ArrayList;

public class MyAdventure {
	
	public ArrayList<String> myAdventure = new ArrayList<String>();
	
	public MyAdventure(String setting, String weapon, String villain) {
		this.myAdventure.add(setting);
		this.myAdventure.add(weapon);
		this.myAdventure.add(villain);
	}
	
	public void displayAdventure(){
		for(int i = 0; i < this.myAdventure.size(); i++){
			System.out.println(this.myAdventure.get(i));
		}
	}

}
