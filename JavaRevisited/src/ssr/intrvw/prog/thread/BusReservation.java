package ssr.intrvw.prog.thread;

public class BusReservation implements Runnable {

	private int seatAvailable = 6;

	@Override
	public void run() {
		System.out.println("Welcome "+Thread.currentThread().getName()+". Total no. of seats avalaible is/are "+seatAvailable);
		Passengers p = (Passengers) Thread.currentThread();
		boolean ticketBooked = this.bookTicket(p.getSeatNeeded(), p.getName());
		if (ticketBooked) {
			System.out.println("Congratulations Mr./Mrs " + p.getName()
					+ " your " + p.getSeatNeeded()
					+ " no. of seat(s) has been booked.");
		} else {
			System.out.println("Sorry Mr./Mrs " + p.getName() + " "
					+ p.getSeatNeeded() + " no. of seat(s) not available.");
		}
	}

	private boolean bookTicket(int seatNeeded, String name) {
		
		if(seatNeeded<=this.getSeatAvailable()){
			seatAvailable = seatAvailable - seatNeeded;
			return true;
		}
		return false;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

}
