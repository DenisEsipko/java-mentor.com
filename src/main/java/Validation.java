/**
 *  This class validates the input string using regular expressions
 */
public class Validation {
    /** arabic numeric expression check pattern */
    final private static String resultArab = "^([1-9]|10)([\\s]?)*[-,+,*,/]([\\s]?)*([1-9]|10)$";
    /** rome numeric expression check pattern */
    final private static String resultRome = "^(I|II|III|IV|V|VI|VII|VII|IX|X)([\\s]?)[-,+,*,/]([\\s]?)(I|II|III|IV|V|VI|VII|VII|IX|X)$";
    /**
     * string validation with any validation pattern (Arab end ROME)
     * @param in_string - input string
     * @return check validation
     */
    public static boolean validation(String in_string) {
        in_string = in_string.trim();
        return (in_string.matches(resultArab)) || in_string.matches(resultRome);
    }
    /**
     * Roman numeral check
     * @param input - input string
     * @return check validation
     */
    public static boolean isResultRome(String input) {
        input = input.trim();
        return input.matches(resultRome);
    }
}
