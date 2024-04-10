package za.ac.cput.Service.CustomerService;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Service.IService;

import java.util.List;

@Service
public interface ICustomerService extends IService<Customer, String> {
    List<Customer> getAll();

}
