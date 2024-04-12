package za.ac.cput.Service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Booking;
import za.ac.cput.Repository.BookingRepository;

import java.util.List;
@Service
public class BookingService implements IBookingService{

    private BookingRepository repository;
    @Autowired
    public BookingService(BookingRepository repository){
        this.repository = repository;

    }

    @Override
    public Booking create(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Booking read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public boolean delete(String s) {
        repository.deleteById(s);
        return repository.existsById(s);
    }
    @Override
    public List<Booking> getAll() {
        return repository.findAll();
    }
}
