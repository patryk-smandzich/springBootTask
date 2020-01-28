package pl.smandzich.javatask.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.dao.Model.Clas;

public interface ClassRepo extends CrudRepository<Clas, Long> {
}
