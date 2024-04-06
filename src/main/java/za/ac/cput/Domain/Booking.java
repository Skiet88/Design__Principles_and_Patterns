package za.ac.cput.Domain;
import java.time.LocalDate;
public class Booking {
    private String bookingID;
    private String customerID;
    private LocalDate date;

    private Booking() {
    }
    private Booking(BookingBulder bookingBulder){
        this.bookingID = bookingBulder.bookingID;
        this.customerID = bookingBulder.customerID;
        this.date = bookingBulder.date;

    }

    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", date=" + date +
                '}';
    }

    public static class BookingBulder{
        private String bookingID;
        private String customerID;
        private LocalDate date;

        public BookingBulder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public BookingBulder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public BookingBulder copy(Booking e) {
            this.bookingID = e.bookingID;
            this.customerID = e.customerID;
            this.date = e.date;

            return this;
        }

        public BookingBulder setDate(LocalDate date) {
            this.date = date;

            return this;
        }

        public Booking build(){
            return new Booking(this);

        }
    }


}
