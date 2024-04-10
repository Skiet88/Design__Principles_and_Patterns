package za.ac.cput.Service.JetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Jet;
import za.ac.cput.Repository.JetRepository;

import java.util.List;
@Service
public class JetService implements IJetService{
    private JetRepository repository ;
    private DataSourcePoolMetadataProvidersConfiguration dataSourcePoolMetadataProvidersConfiguration;

    @Autowired
    public JetService (JetRepository repository){

        this.repository = repository;
    }

    @Override
    public Jet create(Jet jet) {
        return repository.save(jet);
    }

    @Override
    public Jet read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public Jet update(Jet jet) {
        return repository.save(jet);
    }

    @Override
    public boolean delete(String s) {
        repository.deleteById(s);
       return  repository.existsById(s);
    }

    @Override
    public List<Jet> getAll() {
        return repository.findAll();
    }


}
