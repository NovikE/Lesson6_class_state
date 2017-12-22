package by.htp.state.bean;

public class City {
	private String name;
	private int population;
	

	public String setName(String name) {
	    this.name = name;
	    return name;
		}
	
	public Integer setPopulation(int population) {
			this.population = population;
			return population;
		}
	
	public String getName() {
			return name;
		}
	
	public Integer getPopulation() {
			return population;
		}
	
	
	public static void printCity(String name) {
		System.out.println("City: " + name);
	}
}
