package by.htp.state.bean;

public class Region {
	
	private String name;
	private String main_city;
	private int square;
	
	public String setName(String name) {
	    this.name = name;
		return name;
	}
	
	public String setMain_city(String main_city) {
	    this.main_city = main_city;
		return main_city;
	}
	
	public Integer setSquare(int square) {
			this.square = square;
			return square;
		}
	
	public String getName() {
			return name;
		}
	
	public String getMain_city() {
		return main_city;
	}
	
	public Integer getSquare() {
			return square;
		}


}
