package sayalija;

import java.util.ArrayList;
import java.lang.String;

public class Evaluator {

    public String evaluate(String expr) {
        int result = 0;
        ArrayList<Integer> operands = new ArrayList<Integer>(5);
        String[] expression = expr.split(" ");
        for (int i = 0; i < expression.length; i = i + 2) {
            operands.add(Integer.valueOf(expression[i]));
        }
        if (expr.contains("+")) {
            for (Integer operand : operands) {
                result = result + operand;
            }
        }
        return String.valueOf(result);
    }
}
