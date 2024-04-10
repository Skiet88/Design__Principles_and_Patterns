package za.ac.cput.Service.CustomerService;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Factory.ContactFactory;
import za.ac.cput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerServiceTest {
    @Autowired
    private  CustomerService service;
    private Customer customer1;
    private  Customer customer2;

    @BeforeEach
    void setUp() {
        System.out.println("=============================SET-UP====================================");
        customer1  = CustomerFactory.buildCustomer("C001", "Mlungisi", "Mbuyazi",
                "Male", ContactFactory.buildContact("0739956043", "221164014@mycput.ac.za", "10 Dorset St"));
        assertNotNull(customer1);
        System.out.println(customer1);

        customer2  = CustomerFactory.buildCustomer("C002", "Sipho", "Cabane",
                "Male", ContactFactory.buildContact("0784732126", "221164014@mycput.ac.za", "143 Sir Lowry Rd"));
        assertNotNull(customer2);
        System.out.println(customer2);

    }

    @Test
    @Order(1)
    void create() {
        System.out.println("=============================CREATE-TEST====================================");
        Customer savedCustomer = service.create(customer1);
        assertNotNull(savedCustomer);
        System.out.println(savedCustomer);

        Customer savedCustomer2 = service.create(customer2);
        assertNotNull(savedCustomer2);
        System.out.println(savedCustomer2);

    }

    @Test
    @Order(2)
    void read() {
        System.out.println("=============================READ-TEST====================================");
        Customer readCustomer = service.read(customer1.getcustomerNumber());
        assertNotNull(readCustomer);
        System.out.println(readCustomer);
    }

    @Test
    @Order(3)
    void update() {
        System.out.println("=============================UPDATE-TEST====================================");
        Customer newCustomer = new Customer.CustomerBuilder().copy(customer2)
                .setLastName("Makhambeni")
                .build();
        Customer updatedCustomer =service.update(newCustomer);
        assertNotNull(updatedCustomer);
    }

    @Test
    @Order(4)
    void delete() {
        System.out.println("=============================DELETE-TEST====================================");
        boolean isFoundAfterDelete = service.delete(customer1.getcustomerNumber());

        assertEquals(false, isFoundAfterDelete);
        if(isFoundAfterDelete == false){

            System.out.println("Successfullly deleted Customer");
        }
    }

    @Test
    @Order(5)
    void getAll() {
        System.out.println("=============================GET-ALL-TEST====================================");
        System.out.println(service.getAll());
    }
}