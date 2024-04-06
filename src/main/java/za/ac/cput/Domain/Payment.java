package za.ac.cput.Domain;

import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private LocalDate dateOfPayment;
    private String empNumber;
    private String bookingID;


    private Payment() {
    }
    private Payment(PaymentBuilder paymentBuilder) {
        this.paymentID = paymentBuilder.paymentID;
        this.dateOfPayment = paymentBuilder.dateOfPayment;
        this.empNumber = paymentBuilder.empNumber;
        this.bookingID = paymentBuilder.bookingID;

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

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", dateOfPayment=" + dateOfPayment +
                ", empNumber='" + empNumber + '\'' +
                ", bookingID='" + bookingID + '\'' +
                '}';
    }

    private static class PaymentBuilder{
        private String paymentID;
        private LocalDate dateOfPayment;
        private String empNumber;
        private String bookingID;

        public PaymentBuilder copy(Payment e) {

            this.paymentID = e.paymentID;
            this.dateOfPayment = e.dateOfPayment;
            this.empNumber = e.empNumber;
            this.bookingID = e.bookingID;

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
