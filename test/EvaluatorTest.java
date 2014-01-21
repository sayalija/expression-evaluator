import junit.framework.Assert;
import org.junit.Test;
import sayalija.Evaluator;

public class EvaluatorTest {
    @Test
    public void testGives5WhenExpressionIsAdditionOf2And3() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "5";

        actual = eval.evaluate("2+3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives5WhenExpressionIsAdditionOf2And2And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "5";

        actual = eval.evaluate("2+2+1");

        Assert.assertEquals(expected, actual);
    }

    
}
