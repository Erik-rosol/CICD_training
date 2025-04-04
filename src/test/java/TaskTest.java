import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void testTaskCreation(){
        Task task = new Task(1, "Write unit test");
        assertEquals(1, task.getId());
        assertEquals("Write unit test", task.getDescription());
        assertFalse(task.isCompleted());
    }
    @Test
    public void testMarkTaskAsCompleted(){
        Task task = new Task(2, "Complete this task");
        task.setCompleted(true);
        assertTrue(task.isCompleted());}

}
