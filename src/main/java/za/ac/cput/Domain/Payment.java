package za.ac.cput.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.time.LocalDate;
@Entity
@IdClass(PaymentID.class)
public class Payment {
    private String paymentID;
    private LocalDate dateOfPayment;
    @Id
    private String empNumber;
    @Id
    private String bookingID;

    private double paymentAmount;


    protected Payment() {
    }
    private Payment(PaymentBuilder paymentBuilder) {
        this.paymentID = paymentBuilder.paymentID;
        this.dateOfPayment = paymentBuilder.dateOfPayment;
        this.empNumber = paymentBuilder.empNumber;
        this.bookingID = paymentBuilder.bookingID;
        this.paymentAmount = paymentBuilder.paymentAmount;


    }

    public String getPaymentID() {
        return paymentID;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public Double getPaymentAmount(){
        return paymentAmount;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", dateOfPayment=" + dateOfPayment +
                ", empNumber='" + empNumber + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                '}';
    }

    public static class PaymentBuilder{
        private String paymentID;
        private LocalDate dateOfPayment;
        private String empNumber;
        private String bookingID;
        private double paymentAmount;

        public PaymentBuilder copy(Payment e) {

            this.paymentID = e.paymentID;
            this.dateOfPayment = e.dateOfPayment;
            this.empNumber = e.empNumber;
            this.bookingID = e.bookingID;
            this.paymentAmount = e.paymentAmount;

            return this;
        }

        public PaymentBuilder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public PaymentBuilder setDateOfPayment(LocalDate dateOfPayment) {
            this.dateOfPayment = dateOfPayment;
            return this;
        }
        public PaymentBuilder setPaymentAmount(Double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public PaymentBuilder setEmpNumber(String empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public PaymentBuilder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }
        public Payment build(){
            return new Payment(this);
        }
    }
}
