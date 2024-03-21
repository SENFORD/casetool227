package Question_7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class dogTest {
    @Test
    public void testSetNameAndGetBreed() {
        dog dog = new dog("Buddy", "Labrador");
        dog.setName("Charlie");
        dog.setBreed("Golden Retriever");
        assertEquals("Charlie", dog.getName());
        assertEquals("Golden Retriever", dog.getBreed());
    }
}