package pl.smandzich.javatask.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.dao.Model.Subject;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
