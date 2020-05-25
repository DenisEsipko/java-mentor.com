/**
 * This class is responsible for converting Roman to Arabic numerals.
 */
public class RomanToArabic {
    /**
     * This method responsible for converting Roman to Arabic numerals.
     *
     * @param input_string input string
     * @return conversion of expressions with arabic digits
     */
    public static String romanToArabic(String input_string) {

        input_string = input_string.trim();

        /* separator character position  */
        int math_start_position = 0;

        /* looking for separator characters  */
        for (int i = 0; i < input_string.length(); i++) {
            if ((input_string.charAt(i) == '-') ||
                    (input_string.charAt(i) == '+') ||
                    (input_string.charAt(i) == '*') ||
                    (input_string.charAt(i) == '/')
            ) math_start_position = i;
        }
        /* cut out the first digit */
        String str1 = input_string.substring(0, math_start_position).trim();
        /*cut the second digit*/
        String str2 = input_string.substring(math_start_position + 1).trim();
        /*convert to first arabic digit*/
        RomanNumeral romanNumera_1 = RomanNumeral.valueOf(str1);
        /*convert to second arabic digit*/
        RomanNumeral romanNumera_2 = RomanNumeral.valueOf(str2);
        /* collect the converted string*/
        String conversion_string =
                "" + romanNumera_1.getValue() + input_string.charAt(math_start_position) + romanNumera_2.getValue();

        return conversion_string;
    }
}
