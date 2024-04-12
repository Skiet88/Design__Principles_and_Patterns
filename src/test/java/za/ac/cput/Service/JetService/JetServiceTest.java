package za.ac.cput.Service.JetService;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Jet;
import za.ac.cput.Factory.JetFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JetServiceTest {

   @Autowired
   private JetService service;

   private Jet jet1;
   private Jet jet2;
    @BeforeEach
    void setUp() {
     System.out.println("=============================SET-UP====================================");

     jet1 = JetFactory.jetBuilder("B01", "Cessna", 12);
     assertNotNull(jet1);
     System.out.println(jet1);
     jet2 = JetFactory.jetBuilder("B02", "Bombardier", 15);
     assertNotNull(jet2);
     System.out.println(jet2);
    }

    @Test
    @Order(1)
    void create() {
     System.out.println("=============================CREATE-TEST====================================");

     Jet savedJet = service.create(jet1);
      assertNotNull(savedJet);

     System.out.println(savedJet);

     Jet savedJet2 = service.create(jet2);
     assertNotNull(savedJet2);

     System.out.println(savedJet2);
    }

    @Test
    @Order(2)
    void read() {
     System.out.println("=============================READ-TEST====================================");
     Jet readJet = service.read(jet1.getRegNumber());
     assertNotNull(readJet);

     System.out.println(readJet);
    }

    @Test
    @Order(3)
    void update() {
     System.out.println("=============================UPDATE-TEST====================================");

     Jet updatedJet = new Jet.JetBuilder().copy(jet1)
             .setRegNumber("A01")
             .build();

      Jet update = service.update(updatedJet);
      assertNotNull(update);
     System.out.println(update);
    }

    @Test
    @Order(3)
    void delete() {
     System.out.println("=============================DELETE-TEST====================================");

     boolean isFoundAfterDelete = service.delete(jet2.getRegNumber());

      assertEquals(false, isFoundAfterDelete);
       System.out.println("Successfullly deleted Jet");

    }

    @Test
    @Order(4)
    void getAll() {
     System.out.println("=============================GET-ALL-TEST====================================");
     System.out.println(service.getAll());
    }
}