package pl.smandzich.javatask.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.Model.Clas;

public interface ClassRepo extends CrudRepository<Clas, Long> {
}
