package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//System.out.println("Hello world!");
		Randomizer randomizer = new Randomizer();
		Setting setting = new Setting();
		Weapon weapon = new Weapon();
		Villains villain = new Villains();
		String randomSetting = randomizer.getRandom(setting.setting);
		String randomWeapon = randomizer.getRandom(weapon.weapons);
		String randomVillain = randomizer.getRandom(villain.villains);
		
		
		boolean userIsHappy = false;
		while(userIsHappy == false) {
			MyAdventure myAdventure = new MyAdventure(randomSetting,randomWeapon,randomVillain);
			System.out.println("Your adventure is as follows(Setting, Weapon, Your opponent):");
			myAdventure.displayAdventure();
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Press 1 to change the setting");
		    System.out.println("Press 2 to change your weapon");
		    System.out.println("Press 3 to change your opponent");
		    System.out.println("Press 4 to complete your adventure");
		    String userChoice = myObj.nextLine();  // Read user input
		    switch (userChoice) {
            case "1":  randomSetting = randomizer.getRandom(setting.setting);
                     break;
            case "2":  randomWeapon = randomizer.getRandom(weapon.weapons);
                     break;
            case "3":  randomVillain = randomizer.getRandom(villain.villains);
                     break;
            case "4":  System.out.println("Awesome! Your completed adventure is as follows(Setting, Weapon, Your opponent):");
            		myAdventure.displayAdventure();
            		userIsHappy = true;
            break;
            default: System.out.println("Dont be dense. Please choose a valid option");
                     break;
        } 
		}
		
		
		
		//myAdventure.displayAdventure();
	}

}
