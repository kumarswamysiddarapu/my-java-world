package start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class Airport {

    private ConnectionPooling pool = new ConnectionPooling();
    private SeatManager manager = SeatManager.getInstance();

    public void addPassenger(int passengerId, String name, int age,
                             int bookingId, int ticketId,
                             String seatNo, double price) {

        if (!manager.bookSeat()) {
            System.out.println(" No seats available!");
            return;
        }

        Connection con = null;

        try {
            con = pool.getConnection();
            con.setAutoCommit(false);

            String passengerQuery = "INSERT INTO PassengerDetails(passenger_id, name, age, booking_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(passengerQuery);
            ps.setInt(1, passengerId);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setInt(4, bookingId);
            ps.executeUpdate();
            
            Savepoint savepoint=con.setSavepoint("Savepoint created successfully");

            bookTicket(con, ticketId, bookingId, seatNo, price);

            con.commit();

            System.out.println(" Passenger + Ticket Booked!");

        } catch (Exception e) {
            try {
                if (con != null) con.rollback();
                manager.releaseSeat();
                System.out.println(" Booking Failed!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

   
    private void bookTicket(Connection con, int ticketId, int bookingId,
                            String seatNo, double price) throws Exception {

        String ticketQuery = "INSERT INTO TicketDetails(ticket_id, booking_id, seat_no, price) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(ticketQuery);
        ps.setInt(1, ticketId);
        ps.setInt(2, bookingId);
        ps.setString(3, seatNo);
        ps.setDouble(4, price);
        ps.executeUpdate();
    }

   
//    public void displayPassengers() {
//        try (Connection con = pool.getConnection()) {
//
//            String query = "SELECT * FROM PassengerDetails";
//            PreparedStatement ps = con.prepareStatement(query);
//            ResultSet rs = ps.executeQuery();
//
//            System.out.println("\n--- Booked Passengers ---");
//
//             System.out.println(rs.next());
//            while (rs.next()) {
//                System.out.println(
//                        "ID: " + rs.getInt("passenger_id") +
//                        ", Name: " + rs.getString("name") +
//                        ", Age: " + rs.getInt("age") +
//                        ", Booking ID: " + rs.getInt("booking_id")
//                );
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}