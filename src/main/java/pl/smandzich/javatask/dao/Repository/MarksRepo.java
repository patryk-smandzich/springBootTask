package pl.smandzich.javatask.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.dao.Model.Marks;

public interface MarksRepo extends CrudRepository<Marks,Long> {
}
