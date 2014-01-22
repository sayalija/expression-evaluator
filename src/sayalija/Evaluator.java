package sayalija;

import java.lang.String;
import java.util.Stack;

public class Evaluator {

    public String evaluate(String expr) {
        double result = 0;
        double num1, num2;
        char operator;
        Stack<Double> operands = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();

        String[] expression = expr.split(" ");
        if (expression.length == 1)
            return expression[0];
        for (int i = expression.length - 1; i >= 0; i--) {
            System.out.println(expression[i]);
            if (true == "+".equals(expression[i]) || true == "-".equals(expression[i]) || true == "*".equals(expression[i])
                    || true == "/".equals(expression[i]) || true == "^".equals(expression[i])) {
                operators.push(expression[i].charAt(0));
            } else {
                operands.push(Double.valueOf(expression[i]));
            }
        }

        do {
            num1 = operands.pop();
            operator = operators.pop();
            num2 = operands.pop();

            operands.push(calculate(num1, num2, operator));

        } while (false == operators.empty() && false == operands.empty());

        result = operands.pop();
        return String.valueOf(result);

    }

    static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num2 + num1;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return Math.pow(num1, num2);
        }
        return 0;
    }
}