package sayalija;

import java.lang.String;
import java.util.Stack;

public class Evaluator {

    double result = 0;
    double num1, num2;
    char operator;
    Stack<Double> operands = new Stack<Double>();
    Stack<Character> operators = new Stack<Character>();

    String getAppropriateString(String expr){
        expr = expr.trim();
        expr = expr.replaceAll(" *\\( *"," ( ").
                replaceAll(" *\\) *", " ) ").
                replaceAll(" *\\+ *"," + ").
                replaceAll(" *\\* *"," * ").
                replaceAll(" *\\/ *"," / ").
                replaceAll(" *\\^ *"," ^ ").
                replaceAll(" *\\- *"," - ").
                replaceAll("  - "," - ").
                replaceAll("\\(", "( ").
                replaceAll("\\)", " )").
                replaceAll(" *\\- - * ", " + ").
                replaceAll("^ - ", "-");
        return expr;
    }

    public String evaluate(String expr) {
        expr = getAppropriateString(expr);
        return startEvaluation(expr);
    }

    private String startEvaluation(String expr) {
        expr = expr.trim();
        String[] expression = expr.split(" ");
        int startIndex = -1;
        int endIndex = -1;

        if (true == expr.contains("(")) {
            for (int i = 0; i < expr.length(); i++) {
                if ((expr.charAt(i) == '(')) {
                    startIndex = i;
                }
                if ((expr.charAt(i) == ')')) {
                    endIndex = i;
                    break;
                }
            }
            String res = evaluate(expr.substring(startIndex + 2, endIndex - 1));
            res = String.valueOf( Double.parseDouble(res));
            expr = expr.replace("( " + expr.substring(startIndex + 2, endIndex - 1) + " )", res);

            return startEvaluation(expr);

        }

        for (int i = expression.length - 1; i >= 0; i--) {
            if (true == "+".equals(expression[i]) || true == "-".equals(expression[i]) || true == "*".equals(expression[i])
                    || true == "/".equals(expression[i]) || true == "^".equals(expression[i])) {
                operators.push(expression[i].charAt(0));
            } else {
                operands.push(Double.valueOf(expression[i]));
            }
        }

        while (false == operators.empty() && false == operands.empty()) {
            num1 = operands.pop();
            operator = operators.pop();
            num2 = operands.pop();

            operands.push(calculate(num1, num2, operator));
        };

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