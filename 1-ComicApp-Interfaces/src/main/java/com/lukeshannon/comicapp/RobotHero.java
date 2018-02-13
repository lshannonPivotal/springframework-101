/**
 * 
 */
package com.lukeshannon.comicapp;

/**
 * A Robot to save the day. And we know it's a hero...cause its type Hero
 * What else could it be!? :-)
 * @author lshannon
 *
 */
public class RobotHero implements Hero {

	private SideKick sideKick;
	private Power power;
	private Villain villain;

	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public RobotHero(Power power, Villain villian, SideKick sideKick) {
		this.power = power;
		this.villain = villian;
		this.sideKick = sideKick;
	}

	public String saveTheDay() {
		StringBuffer events = new StringBuffer();
		events.append(villain.scheme() + "\n");
		events.append(sideKick.deliverWiseCrack() + "\n");
		events.append(villain.attack("everyone on earth!") + "\n");
		events.append(sideKick.callForBackUp() + "\n");
		events.append(power.use(name, villain.getName()) + "\n");
		events.append(villain.flee() + "\n");
		events.append(rescue() + "\n");
		return events.toString();
	}

	public String rescue() {
		return name + " says: Stay calm humanoids!";
	}

}
