package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Domain.Payment;
import za.ac.cput.Domain.PaymentID;

public interface PaymentRepository extends JpaRepository<Payment, PaymentID> {

}
