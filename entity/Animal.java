package entity;

public class Animal {
	
	private String name;
	private String sound;
	private int numLegs;
	
	public Animal(String name, String sound, int numLegs) {
		this.setName(name);
		this.setSound(sound);
		this.setNumLegs(numLegs);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
	@Override                                //overrides the superclass that's already present in the Object methods
	public String toString() {
		return "This is the " + name + " animal";
	}
	
}
