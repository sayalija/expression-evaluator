import junit.framework.Assert;
import org.junit.Test;
import sayalija.Evaluator;

public class EvaluatorTest {
    @Test
    public void testGives5WhenExpressionIsAdditionOf2And3() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "5";

        actual = eval.evaluate("2 + 3");

        Assert.assertEquals(actual, expected);
    }
    @Test(expected = NumberFormatException.class)
    public void testGivesExceptionWhenExpressionIsNot() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;

        actual = eval.evaluate("+ + 3");
        System.out.println(actual);
    }

}
