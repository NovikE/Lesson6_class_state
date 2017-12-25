package by.htp.state.bean;

public class Area {

	private String name;
	private String maincity;
	private int square;

	public Area(String name, String maincity, int square) {

		this.name = name;
		this.maincity = maincity;
		this.square = square;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaincity(String maincity) {
		this.maincity = maincity;
	}

	public void setSquare(int square) {
		this.square = square;
		// return square;
	}

	public String getName() {
		return name;
	}

	public String getMaincity() {
		return maincity;
	}

	public int getSquare() {
		return square;
	}

	public void printArea() {
		System.out.println(
				"Area: " + this.name + ". Main city is " + this.maincity + ". Square is " + this.square + " m2.");
	}
}
