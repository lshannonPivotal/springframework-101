package com.lukeshannon.comicapp;


import org.springframework.stereotype.Component;

/**
 * @author lshannon
 *
 */
@Component
public class RobotHero implements Hero {

	private SideKick sideKick;
	private Power power;
	private Villian villian;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RobotHero(Power power, Villian villian, SideKick sideKick) {
		this.power = power;
		this.villian = villian;
		this.sideKick = sideKick;
	}

	public String protect() {
		return "I am here to protect!";
	}

	public String saveTheDay() {
		StringBuffer events = new StringBuffer();
		events.append(villian.scheme() + "\n");
		events.append(sideKick.deliverWiseCrack() + "\n");
		events.append(name + " does: " + power.use(villian.getName()) + "\n");
		events.append(villian.flee() + "\n");
		events.append(rescue() + "\n");
		return events.toString();
	}

	public String rescue() {
		return "Stay calm!";
	}

}
