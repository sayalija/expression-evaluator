import junit.framework.Assert;
import org.junit.Test;
import sayalija.Evaluator;

public class EvaluatorTest {
    @Test
    public void testGetSimpleExpressionBack() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "2 + 3";
        actual = eval.getSimpleExpression("2 + 3");
        Assert.assertEquals(actual,expected);
    }
}
