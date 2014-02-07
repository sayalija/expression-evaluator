package sayalija;

/**
 *gives back result by calculating based on operation
 */
public class Operator {
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
