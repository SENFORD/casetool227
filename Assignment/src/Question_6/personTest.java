package Question_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class personTest {
    @Test
    public void testSetNameAndGetAge() {
        person person = new person("John", 30);
        person.setName("Alice");
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }
}