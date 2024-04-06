package za.ac.cput.Factory;

import za.ac.cput.Domain.Payment;
import za.ac.cput.util.PaymentHelper;

import java.time.LocalDate;

public class PaymentFactory {
    public static Payment buildPayment(String paymentID, String customerNumber, String bookingID, Double paymentAmount, LocalDate date){
        if (PaymentHelper.isNullOrEmpty(paymentID) || PaymentHelper.isNullOrEmpty(customerNumber)
                || PaymentHelper.isNullOrEmpty(bookingID) || PaymentHelper.isDateNull(date)){
            return null;
        }
        return new Payment.PaymentBuilder()
                .setPaymentID(paymentID)
                .setDateOfPayment(date)
                .setBookingID(customerNumber)
                .setBookingID(bookingID)
                .setPaymentAmount(paymentAmount)
                .build();
    }

}
