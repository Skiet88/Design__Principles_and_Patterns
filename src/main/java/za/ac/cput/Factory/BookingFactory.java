package za.ac.cput.Factory;

import za.ac.cput.Domain.Booking;
import za.ac.cput.util.BookingHelper;

import java.time.LocalDate;

public class BookingFactory {
    public static Booking buildBooking(String bookingID, String customerNumber, String jetRegNumber, LocalDate date){
        if (BookingHelper.isNullOrEmpty(bookingID)|| BookingHelper.isNullOrEmpty(customerNumber)
                ||BookingHelper.isNullOrEmpty(jetRegNumber)||BookingHelper.isDateNull(date)){
            return null;

        }
        return new Booking.BookingBulder()
                .setBookingID(bookingID)
                .setCustomerID(customerNumber)
                .setJetRegNumber(jetRegNumber)
                .setDate(date)
                .build();

    }
}
