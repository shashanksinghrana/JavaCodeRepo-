package ssr.intrvw.prog.thread;

public class RedBus {

	public static void main(String[] args) {
		BusReservation br = new BusReservation();
		Passengers p1 = new Passengers(3, br, "Suggi");
		Passengers p2 = new Passengers(2, br, "Shashank");
		Passengers p3 = new Passengers(1, br, "Megha");
		Passengers p4 = new Passengers(1, br, "Bholu");
		
		p2.start();
		p1.start();
		p3.start();
		p4.start();
		
		
	}

}
