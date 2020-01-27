package pl.smandzich.javatask.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.Model.Address;

public interface AddressRepo extends CrudRepository<Address,Long> {
}
