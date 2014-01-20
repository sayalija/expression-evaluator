package sayalija;

public class Evaluator {
    public String evaluate(String expr){
        int result = 0;
        String num1, num2, operator;
        String[] expression = expr.split(" ");
        num1 = expression[0];
        operator = expression[1];
        num2 = expression[2];
        if (0 == "+".compareTo(operator))
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return String.valueOf(result);
    }
}
