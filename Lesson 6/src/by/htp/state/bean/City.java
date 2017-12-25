package by.htp.state.bean;

public class City {
	private String name;
	private int population;

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public void printCity() {
		System.out.println(this.name + ".");
	}
}
