package sayalija.cli;

import sayalija.Evaluator;

public class EvaluatorClient {
    public static void main(String[] args) {
        String expr = "";
        for (String arg : args) {
            expr = expr.concat(arg).concat(" ");
        }
        String result;
        Evaluator eval = new Evaluator();
        result = eval.evaluate(expr);
        System.out.println(result);
    }
}
