package mocker.persistence;


import mocker.model.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatorRepository extends JpaRepository<Operator, String> {
    List<Operator> findAll();
}
