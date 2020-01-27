package pl.smandzich.javatask.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.Model.Marks;

public interface MarksRepo extends CrudRepository<Marks,Long> {
}
