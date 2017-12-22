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
		
		Area[] areas = new Area[6];
		areas[0] = area1;
		areas[1] = area2;
		areas[2] = area3;
		
		City capital = new City();
		capital.setName("Minsk");
		
		State state = new State(capital, areas);
		state.setName("Belarus");
	
		System.out.println("Capital of "+ state.getName() + " is " + capital.getName() + ".");
		System.out.println("Area's quantity is " + state.getQuantity() + " .");
		state.printAllAreas(areas);

	}
}
