package ua.lviv.lgs.minimum;

public class Droid {
	@MyAnnotaion(i=2, value="Name of droid")
	private String name;
	@MyAnnotaion(i=1, value="Height of droid")
	private int height;
	@MyAnnotaion(i=0, value="Impact level of droid")
	private int impactLevel;
	private int damage;

	public Droid(String name, int height, int impactLevel, int damage) {
		super();
		this.name = name;
		this.height = height;
		this.impactLevel = impactLevel;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getImpactLevel() {
		return impactLevel;
	}

	public void setImpactLevel(int impactLevel) {
		this.impactLevel = impactLevel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	@MyAnnotaion(run = false, value = " method run() for droid ", i = 8)
	public void run() {
		System.out.println("Droid is runing");
	}

	@Override
	public String toString() {
		return "Droid [name=" + name + ", height=" + height + ", impactLevel=" + impactLevel + ", damage=" + damage
				+ "]";
	}

}
