package mocker.persistence;

import mocker.model.Operator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperatorRespositoryTest {
    @Autowired
    private OperatorRepository operatorRepository;

    @Test
    public void testFindAll() {
        List<Operator> operators = operatorRepository.findAll();
        assertNotNull(operators);
        assertEquals(1, operators.size());
    }
}
