package za.ac.cput.Service.BookingService;

import org.junit.jupiter.api.*;
import za.ac.cput.Domain.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Factory.BookingFactory;

import java.time.LocalDate;

import za.ac.cput.Factory.ContactFactory;
import za.ac.cput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookingServiceTest {
    @Autowired
    private BookingService service;

    private Booking booking1;
    private Customer customer1;

    private Booking booking2;

    @BeforeEach
    void setUp() {
        System.out.println("=============================SET-UP====================================");

        booking1 = BookingFactory.buildBooking("M20A", "C001", "B01", LocalDate.now());
        assertNotNull(booking1);
        System.out.println(booking1);

        booking2 = BookingFactory.buildBooking("M21A", "C001", "B02", LocalDate.now());
        assertNotNull(booking2);
        System.out.println(booking2);
    }

    @Test
    @Order(1)
    void create() {
        System.out.println("=============================CREATE-TEST====================================");

        Booking added = service.create(booking1);
        assertNotNull(added);
        Booking added2 = service.create(booking2);
        assertNotNull(added2);


    }

    @Test
    @Order(2)
    void read() {
        System.out.println("=============================READ-TEST====================================");
        Booking read = service.read(booking1.getBookingID());
        assertNotNull(read);
    }

    @Test
    @Order(3)
    void update() {
        System.out.println("=============================UPDATE-TEST====================================");

        Booking newBooking = new Booking.BookingBuilder().copy(booking1).setJetRegNumber("B02").build();
        Booking updated = service.update(newBooking);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        System.out.println("=============================DELETE-TEST====================================");
        boolean isFoundAfterDelete = service.delete(booking2.getBookingID());
        assertEquals(false, isFoundAfterDelete);

    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println("=============================GET-ALL-TEST====================================");

        System.out.println(service.getAll());


    }
}