package za.ac.cput.Service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Booking;
import za.ac.cput.Domain.Payment;
import za.ac.cput.Domain.PaymentID;
import za.ac.cput.Repository.PaymentRepository;

import java.util.List;
@Service
public class PaymentService implements IPaymentService {
    private PaymentRepository repository;
@Autowired
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;

    }

    @Override
    public Payment create(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public Payment read(PaymentID paymentID) {
        return repository.findById(paymentID).orElse(null);
    }

    @Override
    public Payment update(Payment payment) {

        return repository.save(payment);
    }

    @Override
    public boolean delete(PaymentID paymentID) {
       repository.deleteById(paymentID);
       return repository.existsById(paymentID);
    }

    @Override
    public List<Payment> getAll() {
        return repository.findAll();
    }
}
