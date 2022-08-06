import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readArray(scanner);

        // Create point x
        Point pointA = new Point(coordinates[0], coordinates[1]);

        // Create point y
        Point pointC = new Point(coordinates[2], coordinates[3]);

        // Create Rectangle
        Rectangle rectangle = new Rectangle(pointA, pointC);

        // Read n
        int n = Integer.parseInt(scanner.nextLine());

        // Read n points
        while (n-- > 0) {
           int[] tokens = readArray(scanner);

           // Print True/False for each n point is in the Rectangle
           Point p = new Point(tokens[0], tokens[1]);
           boolean isInside = rectangle.isInside(p);
            System.out.println(isInside);
        }
    }
    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
