import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput1;
        String userInput2;

        // loop until user enters 'q'
        while (true) {
            // prompt user for input
            System.out.println("Enter input string: ");
            String s = sc.nextLine();

            if (s.equals("q")) {
                break;
            }

            // check to see if input contains a comma
            if (!s.contains(",")) {
                System.out.println("Error: No comma in string");
            }

            // if valid, split string by comma and trim spaces
            else {
                String[] input = s.split(",", 2);
                if (input.length == 2) {
                    userInput1 = input[0].trim();
                    userInput2 = input[1].trim();
                    System.out.println("First word: " + userInput1);
                    System.out.println("Second word: " + userInput2);
                    System.out.println();
                    System.out.println();
                }

                // if invalid, prompt user again
                else {
                    System.out.println("Please enter two strings seperated by a comma: ");
                }

            }
        }
    }
}
