package za.ac.cput.Service.PaymentService;

import za.ac.cput.Domain.Booking;
import za.ac.cput.Domain.Payment;
import za.ac.cput.Domain.PaymentID;
import za.ac.cput.Service.IService;

import java.util.List;

public interface IPaymentService extends IService<Payment, PaymentID> {
    List<Payment> getAll();
}
