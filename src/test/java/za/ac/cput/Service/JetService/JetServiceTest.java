package za.ac.cput.Service.JetService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.Domain.Jet;
import za.ac.cput.Factory.JetFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class JetServiceTest {

   @Autowired
   private JetService service;

   private Jet jet1;
   private Jet jet2;
    @BeforeEach
    void setUp() {
     jet1 = JetFactory.jetBuilder("B01", "Cessna", 12);
     assertNotNull(jet1);
     System.out.println(jet1);
     jet2 = JetFactory.jetBuilder("B02", "Bombardier", 15);
     assertNotNull(jet2);
     System.out.println(jet2);
    }

    @Test
    void create() {
      Jet savedJet = service.create(jet1);
      assertNotNull(savedJet);

     System.out.println(savedJet);
    }

    @Test
    void read() {
     Jet readJet = service.read(jet1.getRegNumber());
     assertNotNull(readJet);

     System.out.println(readJet);
    }

    @Test
    void update() {
     Jet updatedJet = new Jet.JetBuilder().copy(jet1)
             .setRegNumber("A01")
             .build();

      Jet update = service.update(updatedJet);
      assertNotNull(update);
     System.out.println(update);
    }

    @Test
    void delete() {
      boolean isDeleted = service.delete(jet2.getRegNumber());
    }

    @Test
    void getAll() {
     System.out.println(service.getAll());
    }
}