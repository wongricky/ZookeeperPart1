package com.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Current energy level is: " + this.energyLevel);
		return energyLevel;
	}
}
