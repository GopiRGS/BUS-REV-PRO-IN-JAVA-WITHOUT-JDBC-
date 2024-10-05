package busRev;
import java.util.Scanner;
import java.util.ArrayList;
public class busDemo{
public static void main(String[] args) {
	Bus buses[] = new Bus[50];//ArrayList - collection
	ArrayList<Bus> bus = new ArrayList<Bus>();
	
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	bus.add(new Bus(1,true,2));
	bus.add(new Bus(2,false,50));
	bus.add(new Bus(3,true,48));
	
	
	int userOpt = 1;
	Scanner scanner = new Scanner(System.in);
	
	for(Bus b:bus) {
		b.displayBusInfo();
	}
		while(userOpt==1) {
		System.out.println("Enter 1 to BOOK 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt == 1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,bus)) {
				bookings.add(booking);
				System.out.println("Your booking is conformed .... Happy journey...");
			}
			else {
				System.out.println("Sorry,try another bus else another date ...");
			}
			
		}
		}
	}

}
