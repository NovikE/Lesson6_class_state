package by.htp.state.runner;

import by.htp.state.bean.Area;
import by.htp.state.bean.City;
import by.htp.state.bean.State;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area area1 = new Area("Minskaya", "Minsk", 123);
		Area area2 = new Area("Brestskay", "Brest", 213);
		Area area3 = new Area("Mogilevskay", "Mogilev", 321);
		final int AREA_NUMBER = 6;
		Area[] areas = new Area[AREA_NUMBER];
		City capital = new City();

		State state = new State();
		capital.setName("Minsk");
		state.setName("Belarus");
		state.setCapital(capital);
		state.addArea(area1);
		state.addArea(area2);
		state.addArea(area3);

		System.out.print("Capital of " + state.getName() + " is ");
		state.getCapital().printCity();
		System.out.println("Area's quantity is " + state.getQuantityAreas() + ".");
		state.printAllAreas(state.getAreas());

	}
}
