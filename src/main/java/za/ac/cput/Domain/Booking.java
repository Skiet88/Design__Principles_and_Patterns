package za.ac.cput.Domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Booking {
    @Id
    private String bookingID;
    private String customerID;
    private  String jetRegNumber;
    private LocalDate date;

    protected Booking() {
    }
    private Booking(BookingBuilder bookingBuilder){
        this.bookingID = bookingBuilder.bookingID;
        this.customerID = bookingBuilder.customerID;
        this.date = bookingBuilder.date;
        this.jetRegNumber = bookingBuilder.jetRegNumber;

    }

    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getJetRegNumber() {
        return jetRegNumber;
    }
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", jetRegNumber='" + jetRegNumber + '\'' +
                ", date=" + date +
                '}';
    }

    public static class BookingBuilder{
        private String bookingID;
        private String customerID;

        private String jetRegNumber;
        private LocalDate date;

        public BookingBuilder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }
        public BookingBuilder setJetRegNumber(String jetRegNumber) {
            this.jetRegNumber = jetRegNumber;
            return this;
        }

        public BookingBuilder setCustomerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public BookingBuilder copy(Booking e) {
            this.bookingID = e.bookingID;
            this.customerID = e.customerID;
            this.date = e.date;
            this.jetRegNumber = e.jetRegNumber;

            return this;
        }

        public BookingBuilder setDate(LocalDate date) {
            this.date = date;

            return this;
        }

        public Booking build(){
            return new Booking(this);

        }
    }


}
