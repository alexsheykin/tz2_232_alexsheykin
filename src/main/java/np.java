import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class np {
    public static void main(String[] args) {
        String filePath = "numbers.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            int[] numbers = Arrays.stream(content.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println("Мин " + _min(numbers));
            System.out.println("Макс " + _max(numbers));
            System.out.println("Сумма " + _sum(numbers));
            System.out.println("Произведение " + _mult(numbers));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int _min(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }
    public static int _max(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    }
    public static long _sum(int[] numbers) {
        return Arrays.stream(numbers).asLongStream().sum();
    }
    public static long _mult(int[] numbers) {
        return Arrays.stream(numbers).asLongStream().reduce(1, (a, b) -> a * b);
    }
}