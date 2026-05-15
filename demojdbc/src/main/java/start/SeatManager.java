package start;

public class SeatManager {

	    private static SeatManager manage;
	    private int seats = 10;

	    private SeatManager() {}

	    public static SeatManager getInstance() {
	        if (manage == null) {
	            manage = new SeatManager();
	        }
	        return manage;
	    }

	    public synchronized boolean bookSeat() {
	        if (seats > 0) {
	            seats--;
	            return true;
	        }
	        return false;
	    }

	    public synchronized void releaseSeat() {
	               seats++;
	    }

	    public int getAvailableSeats() {
	        return seats;
	    }
	}
