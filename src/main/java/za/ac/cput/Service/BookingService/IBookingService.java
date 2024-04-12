package za.ac.cput.Service.BookingService;

import za.ac.cput.Domain.Booking;
import za.ac.cput.Service.IService;

import java.util.List;

public interface IBookingService extends IService<Booking, String> {
    List<Booking> getAll();
}
