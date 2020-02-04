package pl.smandzich.javatask.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.dao.Model.Address;

public interface AddressRepo extends CrudRepository<Address, Long> {
}
