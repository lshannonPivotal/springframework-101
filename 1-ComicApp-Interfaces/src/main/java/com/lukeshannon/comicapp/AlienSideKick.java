package com.lukeshannon.comicapp;

/**
 * Side kick from Space the implements the SideKick interface
 * @author lshannon
 *
 */
public class AlienSideKick implements SideKick {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String deliverWiseCrack() {
		return name + " says: Nice try punk, you would not last a nanosecond on Mars";
	}

	public String callForBackUp() {
		return name + " says: Bring in the big guns! We need some help!";
	}
	
	public String specialAlienTrait() {
		return name + " says: I see through walls";
	}

}
