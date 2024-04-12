package za.ac.cput.Service.PaymentService;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Payment;
import za.ac.cput.Domain.PaymentID;
import za.ac.cput.Factory.PaymentFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentServiceTest {

@Autowired private PaymentService service;
private Payment payment1;
private Payment payment2;

    @BeforeEach
    void setUp() {
        System.out.println("=============================SET-UP====================================");

        payment1 = PaymentFactory.buildPayment("P101", "C001", "M20A",380.99, LocalDate.now());
        assertNotNull(payment1);
        System.out.println(payment1);
        payment2 = PaymentFactory.buildPayment("P101", "C001", "M20A",380.99, LocalDate.now());
        assertNotNull(payment2);
        System.out.println(payment2);

    }

    @Test
    @Order(1)
    void create() {
        System.out.println("=============================CREATE-TEST====================================");

        Payment newPayment1 = service.create(payment1);
        assertNotNull(newPayment1);
        System.out.println(newPayment1);

        Payment newPayment2 = service.create(payment2);
        assertNotNull(newPayment2);


    }

    @Test
    @Order(2)
    void read() {
        System.out.println("=============================READ-TEST====================================");

        PaymentID newPaymentID = new PaymentID(payment1.getEmpNumber(), payment1.getBookingID());
        Payment newPayment = service.read(newPaymentID);

        assertNotNull(newPayment);
    }

    @Test
    @Disabled
    @Order(3)
    void update() {
        System.out.println("=============================UPDATE-TEST====================================");


    }

    @Test
    @Order(4)
    void delete() {
        System.out.println("=============================DELETE-TEST====================================");

        PaymentID newPaymentID = new PaymentID(payment2.getEmpNumber(), payment2.getBookingID());
        boolean existAfterDelete = service.delete(newPaymentID);

        assertEquals(false, existAfterDelete);



    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println("=============================GET-ALL-TEST====================================");

        System.out.println(service.getAll());
    }
}