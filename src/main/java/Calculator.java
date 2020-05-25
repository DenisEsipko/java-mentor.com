import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * in this methods we do calculations
 */
public class Calculator {
    /**
     *in this class we do math
     * @param string_input - input string
     * @return object with the result of calculation
     */
    public static Object Сalculation(String string_input) {

        /** calculation result  */
        Object calculation_result = null;

        /**open the scripting engine in Java */
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        /**
         * calculate the result and return
         */
        try {
            calculation_result = engine.eval(string_input);
        } catch (final ScriptException se) {
            se.printStackTrace();
        }
        return calculation_result;
    }
}
