package main;

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
		MyAdventure myAdventure = new MyAdventure(randomSetting,randomWeapon,randomVillain);
		
		boolean userIsHappy = false;
		
		System.out.println("Your adventure is as follows(Setting, Weapon, Your opponent):");
		myAdventure.displayAdventure();
		
		
		//myAdventure.displayAdventure();
	}

}
