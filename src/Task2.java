import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        int x = readInt("Введите х");
        int y = readInt("Введите y");
        System.out.println("x + y = " + (x+y));
    }

    private static int readInt(String numbers) {
        Scanner s = new Scanner(System.in);
        System.out.println(numbers);
        while (true) {
            try {
                return Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(numbers);
            }
        }
    }
}
