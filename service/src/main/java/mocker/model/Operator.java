package mocker.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Operator {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String password;
}
