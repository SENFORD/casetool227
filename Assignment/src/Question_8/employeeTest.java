package Question_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class employeeTest {
    @Test
    public void testCalculateDA() {
        employee employee = new employee("John Doe", "Software Engineer", 50000);
        assertEquals(5000, employee.calculateDA());
    }
}
