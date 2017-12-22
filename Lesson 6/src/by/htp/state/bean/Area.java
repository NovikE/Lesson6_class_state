package by.htp.state.bean;

public class Area {
	
	private String name;
	private String main_city;
	private int square;
	
	public Area(String name, String main_city, int square) {

		this.name = name;
		this.main_city = main_city;
		this.square = square;
	}
	
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
	public static void printArea(Area area) {
		System.out.println("Area: " + area.name + ". Main city is " + area.main_city + ". Square is " + area.square + " m2.");
	}
}
