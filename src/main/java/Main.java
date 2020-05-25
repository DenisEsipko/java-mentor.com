import java.util.Scanner;

/**
 *  main class
 * @autor Iesipko Denys
 */

public class Main {
    /**
     *open the scanner and read expressions before the first error
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            while (true) {
                System.out.print("> ");

                String string_input = in.nextLine();

                // check string for compliance
                if (Validation.validation(string_input)) {
                    //if the string with roman numerals is converted
                    if (Validation.isResultRome(string_input)) {
                        string_input = RomanToArabic.romanToArabic(string_input);
                    }
                    //calculate the result
                    Object calculation_result = Calculator.Сalculation(string_input);
                    System.out.println(string_input + " = " + calculation_result);
                } else {
                    throw new Calculator_Error();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}
