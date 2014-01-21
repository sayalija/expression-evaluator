package sayalija;

public class Evaluator {
    int result = 0;
    String num1, num2, operator;
    int index;

    public String evaluate(String expr) {
        if(true == isInteger(expr))
            return expr;
        index =expr.indexOf('+');
        num1 = expr.substring(0,index);
        System.out.println(num1);
        operator = String.valueOf(expr.charAt(index));
        System.out.println(operator);
        num2 = evaluate(expr.substring(index+1));
        System.out.println(num2);
        if (0 == "+".compareTo(operator))
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return String.valueOf(result);
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
