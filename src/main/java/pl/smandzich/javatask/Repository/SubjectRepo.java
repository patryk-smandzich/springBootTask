package pl.smandzich.javatask.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.Model.Subject;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
