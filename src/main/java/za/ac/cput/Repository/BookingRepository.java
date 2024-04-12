package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Booking;
import za.ac.cput.Domain.Customer;

public interface BookingRepository extends JpaRepository<Booking, String> {
}
