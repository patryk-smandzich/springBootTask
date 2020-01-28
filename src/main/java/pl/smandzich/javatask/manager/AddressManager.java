package pl.smandzich.javatask.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smandzich.javatask.dao.Model.Address;
import pl.smandzich.javatask.dao.Repository.AddressRepo;

@Service
public class AddressManager {

    private AddressRepo addressRepo;

    @Autowired
    public AddressManager(AddressRepo addressRepo){
        this.addressRepo = addressRepo;
    }

    public Address save (Address address){
        return addressRepo.save(address);
    }

    public Iterable<Address> findAll(){
        return addressRepo.findAll();
    }

}
