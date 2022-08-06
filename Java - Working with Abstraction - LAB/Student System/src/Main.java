import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        boolean isRunning = true;
        while (isRunning) {

            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("Exit")) {
                break;
            }

            String output = studentSystem.parseCommand(input);
            if (output != null) {
                System.out.println(output);
            }
            isRunning = !"Exit".equals(output);
        }
    }
}
