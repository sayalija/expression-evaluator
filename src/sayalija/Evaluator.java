package sayalija;

import java.util.ArrayList;
import java.lang.String;
import java.util.Stack;

import static sayalija.Evaluator.calculate;

public class Evaluator {

    public String evaluate1(String expr) {
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

    public String evaluate(String expr) {
        int result = 0;
        int num1, num2;
        char operator;
        Stack<Integer> operands = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();
        String[] expression = expr.split(" ");
        for (int i = 0; i < expression.length; i = i + 2) {
            operands.push(Integer.valueOf(expression[i]));
        }
        for (int i = 1; i < expression.length; i = i + 2) {
            operators.push(expression[i].charAt(0));
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

    static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num2 + num1;
            case '-':
                return num2 - num1;
            case '*':
                return num2 * num1;
            case '/':
                return num2 / num1;
            case '^':
                return (int) Math.pow(num2,num1);
        }
        return 0;
    }

}
