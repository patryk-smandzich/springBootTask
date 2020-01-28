package pl.smandzich.javatask.dao.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.smandzich.javatask.dao.Model.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
