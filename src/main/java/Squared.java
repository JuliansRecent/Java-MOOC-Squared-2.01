
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Collect a number from the user
        int numberToSquare = Integer.valueOf(reader.nextLine());
        // Square the number
        int result = numberToSquare * numberToSquare;
        // Return the number
        System.out.println(result);
    }
}
