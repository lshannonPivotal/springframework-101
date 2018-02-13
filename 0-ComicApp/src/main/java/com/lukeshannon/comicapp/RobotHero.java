package com.lukeshannon.comicapp;

/**
 * Everything revolves around the Hero. And perhaps this is the way of things. 
 * Would there be a Joker if there had not been a Batman? Who is the true
 * root of Chaos? Is Chaos really evil or is it what gives birth to Order. 
 * These questions and many more will not be addressed in this code sample.
 * 
 * @author lshannon
 *
 */
public class RobotHero {

	private SuperStrength power;
	private SuperIntelligentVillain villian;
	private AlienSideKick sideKick;
	
	/*
	 * These is lots *not* to like here
	 */
	public RobotHero() {
		//create and configure a Power
		SuperStrength power = new SuperStrength();
		power.setName(name);
		this.power = power;
		
		//create and configure a Villain
		SuperIntelligentVillain villain = new SuperIntelligentVillain();
		villain.setName("Crazy Cortex!");
		this.villian = villain;
		
		//create and configure a Side Kick
		AlienSideKick sideKick = new AlienSideKick();
		sideKick.setName("Kip");
		this.sideKick = sideKick;
	}

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Not liking this
	 */
	public String rescue() {
		return name + " says: Stay Calm - Intitating Search and Rescue Mode"; 
		
	}
	
	/*
	 * Cripes!
	 */
	public String saveTheDay() {
		StringBuffer events = new StringBuffer();
		events.append(villian.scheme() + "\n");
		events.append(sideKick.deliverWiseCrack() + "\n");
		events.append(villian.attack("everyone on earth!") + "\n");
		events.append(sideKick.callForBackUp() + "\n");
		events.append(power.use(name, villian.getName()) + "\n");
		events.append(villian.flee() + "\n");
		events.append(rescue() + "\n");
		return events.toString();
	}
	

}
