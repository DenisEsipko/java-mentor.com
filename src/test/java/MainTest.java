import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        String[] arr_input_string = {"1+5", "5+5", "V-I", "V*IV", "6/2"};
        List<Integer> right_answers = new ArrayList<>(Arrays.asList(6, 10, 4, 20, 3));
        List<Integer> answer = new ArrayList<>();

        for (String string_input : arr_input_string) {

            if (Validation.validation(string_input)) {
                if (Validation.isResultRome(string_input)) {
                    string_input = RomanToArabic.romanToArabic(string_input);
                }

                Object calculation_result = Calculator.Сalculation(string_input);
                Integer calc = (Integer) calculation_result;
                answer.add(calc);

            } else {
                try {
                    throw new Calculator_Error();
                } catch (Calculator_Error calculator_error) {
                    calculator_error.printStackTrace();
                }
            }
        }

        assertArrayEquals(right_answers.toArray(), answer.toArray());
    }
}