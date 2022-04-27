package dev.israelld.baseBank.service;

import java.util.List;
import java.util.Optional;

import dev.israelld.baseBank.model.Historic;
import dev.israelld.baseBank.repository.HistoricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricService {

	@Autowired
	private HistoricRepository repository;
	
	public Historic findById(Long id) {
        Optional<Historic> obj = repository.findById(id);
        return obj.orElse(null);
    }
	
	public List<Historic> findAll() {
        return repository.findAll();
    }
	
	public Historic update(Long id, Historic obj) {
		Historic newObj = findById(id);
		newObj.setId(id);
        newObj.setAccount(obj.getAccount());
        newObj.setAccountNumberDestiny(obj.getAccountNumberDestiny());
        newObj.setAccountNumberOrigin(obj.getAccountNumberOrigin());  
        newObj.setHistoric_data(obj.getHistoric_data()); 
        newObj.setHistoricType(obj.getHistoricType()); 
        return repository.save(newObj);
    }
	
	public Historic create(Historic obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }
}
