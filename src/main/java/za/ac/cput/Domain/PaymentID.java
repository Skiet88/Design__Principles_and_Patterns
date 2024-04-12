package za.ac.cput.Domain;

import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class PaymentID implements Serializable {
    @Id
    private String empNumber;
    @Id
    private String bookingID;

    public PaymentID() {

    }

    public PaymentID(String empNumber, String bookingID) {
        this.empNumber =empNumber;
        this.bookingID = bookingID;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentID PaymentID = (PaymentID) o;
        return Objects.equals(empNumber, PaymentID.empNumber) && Objects.equals(bookingID, PaymentID.bookingID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, bookingID);
    }
}
