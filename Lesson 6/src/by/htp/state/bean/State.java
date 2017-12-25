package by.htp.state.bean;

public class State {

	private String name;
	private City capital = new City();
	private Area[] areas = new Area[6];
	private Region[] regions = new Region[12];

	public void setName(String name) {
		this.name = name;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public void setAreas(Area[] areas) {
		this.areas = areas;

	}

	public String getName() {
		return name;
	}

	public Area[] getAreas() {
		return areas;
	}
	
	public City getCapital() {
		return capital;
	}

	public int getQuantityAreas() {
		int quantity = 0;
		for (int i = 0; i < areas.length; i++) {
			if (areas[i] != null) {
				quantity++;
			}
		}
		return quantity;
	}

	public void addArea(Area area) {
		this.areas[getQuantityAreas()] = area;
	}

	public void printAllAreas(Area[] areas) {

		for (int i = 0; i < areas.length; i++) {
			if (areas[i] != null) {
				areas[i].printArea();
			}

		}

	}
}
