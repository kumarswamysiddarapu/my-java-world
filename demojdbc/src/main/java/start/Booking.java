package start;

import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Airport service = new Airport();

        System.out.println("Enter Passenger ID:");
        int passengerId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Booking ID:");
        int bookingId = sc.nextInt();

        System.out.println("Enter Ticket ID:");
        int ticketId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Seat No:");
        String seatNo = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        
        service.addPassenger(passengerId, name, age,
                             bookingId, ticketId, seatNo, price);

       
       // service.displayPassengers();

        sc.close();
    }
}