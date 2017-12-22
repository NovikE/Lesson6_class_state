package by.htp.state.bean;

public class State {
	
	private String name;
	private City capital = new City();
	private Area[] areas = new Area[6];
	private Region[] regions = new Region[12];
	
	public State(City capital, Area[] areas) {
		this.capital = capital;
		this.areas = areas; 
		}
	

	public String setName(String name) {
		this.name = name;
		return name;
	}

	
	public City setCapital(City capital) {
	    this.capital = capital;
		return capital;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getQuantity() {
		int quantity = 0;
			for (int i = 0; i < areas.length; i++) {
				if (areas[i] != null) {
				quantity++;
				}
			
		}
		
		return quantity;
	}
	
	public void printAllAreas(Area[] areas) {
		
		for (int i = 0; i < areas.length; i++) {
			if (areas[i] != null) {
				areas[i].printArea(areas[i]);
			}
			
		}
		
	}
}
