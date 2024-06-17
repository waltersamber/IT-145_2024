import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea;
        double gallonsPaintNeeded;

        final double squareFeetPerGallons = 350.0;

        // Implement a do-while loop to ensure input is valid
        do {
            try {
                // Prompt user to input wall's height
                System.out.println("Enter wall height (feet): ");
                wallHeight = scanner.nextDouble();

                // Validate input is > 0
                if (wallHeight <= 0.0) {
                    System.out.println("Invalid wall height. Enter a number greater than 0.");
                    // Reset wall height to continue loop
                    wallHeight = 0.0;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid wall height. Enter a numerical value.");
                // Clear invalid input
                scanner.nextLine();
            }
        } while (wallHeight == 0.0);

        // Implement a do-while loop to ensure input is valid
        do {
            try {
                // Prompt user to input wall's width
                System.out.println("Enter wall width (feet): ");
                wallWidth = scanner.nextDouble();

                // Validate input is > 0
                if (wallWidth <= 0.0) {
                    System.out.println("Invalid wall width. Enter a number greater than 0.");
                    // Reset wall width to continue loop
                    wallWidth = 0.0;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid wall width. Enter a numerical value.");
                // Clear invalid input
                scanner.nextLine();
            }
        } while (wallWidth == 0.0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint needed
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}