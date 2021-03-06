package com.lukeshannon.comicapp;
/**
 * 
 */

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author lshannon
 *
 */
@Component
public class RobotHero implements Hero {

	private SideKick sideKick;
	private Power power;
	private Villain villain;
	
	@Autowired
	Environment env;
	
	public static String PROTECT_STATEMENT = "protect.statement";
	
	@PostConstruct
	public void init() {
		System.out.println("+++ Before beginning (or even getting a name), the Hero goes into the future to learn everything out before it happens");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RobotHero(Power power, Villain villian, @Qualifier("seriousSideKick") SideKick sideKick) {
		this.power = power;
		this.villain = villian;
		this.sideKick = sideKick;
	}

	public String protect() {
		return name + " says: " + env.getProperty(PROTECT_STATEMENT);
	}

	public String saveTheDay() {
		StringBuffer events = new StringBuffer();
		events.append(villain.scheme() + "\n");
		events.append(sideKick.deliverWiseCrack() + "\n");
		events.append(protect() + "\n");
		events.append(power.use(name, villain.getName()) + "\n");
		events.append(villain.flee() + "\n");
		events.append(rescue() + "\n");
		return events.toString();
	}

	public String rescue() {
		return "Stay calm!";
	}

}
