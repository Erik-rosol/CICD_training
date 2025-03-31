import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaskTest {
    @Test
    void testTaskCreation(){
        Task task = new Task(1, "Write unit test");
        assertEquals(1, task.getId());
        assertEquals("Write unit test", task.getDescription());
        assertFalse(task.isCompleted());
    }
}
