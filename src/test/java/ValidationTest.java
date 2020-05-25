import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @org.junit.jupiter.api.Test
    void validation() {
        assertEquals(Validation.validation("1+2"), true);
        assertEquals(Validation.validation(" 10-2"), true);
        assertEquals(Validation.validation(" 10 + 2"), true);
        assertEquals(Validation.validation(" 9 * 10"), true);
        assertEquals(Validation.validation(" 8 * 2"), true);

        assertEquals(Validation.validation(" 0 + 2"), false);
        assertEquals(Validation.validation(" 11 * 2"), false);
        assertEquals(Validation.validation(" 112 / 2"), false);
    }

    @org.junit.jupiter.api.Test
    void isResultRome() {
        assertEquals(Validation.isResultRome(" III + I"), true);
        assertEquals(Validation.isResultRome("II+I"), true);
        assertEquals(Validation.isResultRome("IV+VI"), true);
        assertEquals(Validation.isResultRome(" V + V "), true);
        assertEquals(Validation.isResultRome(" X + V "), true);

        assertEquals(Validation.isResultRome(" 1 + V "), false);
        assertEquals(Validation.isResultRome(" X + IIIIV "), false);
        assertEquals(Validation.isResultRome(" IIII + V "), false);
        assertEquals(Validation.isResultRome(" II + 3 "), false);
    }
}