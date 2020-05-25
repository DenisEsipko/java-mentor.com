import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToArabicTest {

    @Test
    void romanToArabic() {
        assertEquals(RomanToArabic.romanToArabic("III*IV"), "3*4");
        assertEquals(RomanToArabic.romanToArabic("V*VII"), "5*7");
        assertEquals(RomanToArabic.romanToArabic("VIII+IX"), "8+9");
        assertEquals(RomanToArabic.romanToArabic("V-III"), "5-3");
    }
}