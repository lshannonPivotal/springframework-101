package com.lukeshannon.comicapp;

public class AlienSideKick implements SideKick {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String deliverWiseCrack() {
		return "Earthlings are the worst!";
	}

	public String callForBackUp() {
		return "Bring in the big guns! We need some help!";
	}
	
	public String specialAlienTrait() {
		return "I am see through walls";
	}

}
