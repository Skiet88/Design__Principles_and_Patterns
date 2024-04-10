package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Jet;

@Repository
public interface JetRepository extends JpaRepository<Jet, String> {

}
