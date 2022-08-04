package functions.as.returnvalues;

import java.util.function.BiFunction;

public class Math {

    /**
     * This method returns a BiFunction which returns a concatnated string value of given parameters
     * @param gender if true then 'Male' else 'Female'
     * @return BiFunction which take String and Integer parameters and return a String value
     */
    public BiFunction<String, Integer, String> getConcatner(Boolean gender) {
        return (name, age) -> "My name is " + name + " and my age is " + age + " and my gender is " +
                ((gender) ? "Male" : "Female");
    }

}
