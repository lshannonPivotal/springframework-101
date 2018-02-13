package com.lukeshannon.comicapp.test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.lukeshannon.comicapp.Power;
import com.lukeshannon.comicapp.RobotHero;
import com.lukeshannon.comicapp.SideKick;
import com.lukeshannon.comicapp.Villain;

public class HeroTest {
	
	@Test
	public void AdvRobotHeroTest() {
		Power mockPower = mock(Power.class);
		SideKick mockSideKick = mock(SideKick.class);
		Villain mockSuperVillian = mock(Villain.class);
		RobotHero alphaBot = new RobotHero(mockPower,mockSuperVillian,mockSideKick);
		alphaBot.setName("Alpha Bot!");
		assertNotNull(alphaBot.saveTheDay());
	}
	
}
