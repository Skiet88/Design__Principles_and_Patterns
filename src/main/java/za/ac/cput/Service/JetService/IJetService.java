package za.ac.cput.Service.JetService;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Jet;
import za.ac.cput.Service.IService;

import java.util.List;
@Service
public interface IJetService extends IService<Jet, String> {
    List<Jet> getAll();

}
