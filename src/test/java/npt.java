import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {
    @Test
    public void testMin() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(1, NumberProcessor._min(numbers));
    }

    @Test
    public void testMax() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(4, NumberProcessor._max(numbers));
    }

    @Test
    public void testSum() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(10, NumberProcessor._sum(numbers));
    }

    @Test
    public void testMult() {
        int[] numbers = {1, 4, 2, 3};
        assertEquals(24, NumberProcessor._mult(numbers));
    }

    @Test
    public void testPerformance() {
        int[] numbers = new int[1000000];
        Arrays.fill(numbers, 1);

        long start = System.currentTimeMillis();
        NumberProcessor._min(numbers);
        NumberProcessor._max(numbers);
        NumberProcessor._sum(numbers);
        NumberProcessor._mult(numbers);
        long end = System.currentTimeMillis();

        long duration = end - start;
        System.out.println("Длительность теста производительности: " + duration + "мс");
        assertTrue(duration < 3000);
    }
}

