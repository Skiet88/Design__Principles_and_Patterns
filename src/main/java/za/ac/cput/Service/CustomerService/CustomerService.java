package za.ac.cput.Service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Customer;
import za.ac.cput.Repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private CustomerRepository repository;
    @Autowired
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);

//        String customerNo = customer.getcustomerNumber();
//        if (delete(customerNo)) {
//            return repository.save(customer);
//        }
//        return null;
    }

    @Override
    public boolean delete(String s) {
        repository.deleteById(s);
        return repository.existsById(s);
    }
    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
