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

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives5WhenExpressionIsAdditionOf2And2And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "5";

        actual = eval.evaluate("2 + 2 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives7ForAdditionOf2And4And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "7";

        actual = eval.evaluate("2 + 4 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives14ForAdditionOf10And2And1And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "14";

        actual = eval.evaluate("10 + 2 + 1 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForSubtractionOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4";

        actual = eval.evaluate("6 - 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForMultiplicationOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "24";

        actual = eval.evaluate("3 * 8");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForDivisionOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4";

        actual = eval.evaluate("12 / 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives64For8PowerOf2() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "64";

        actual = eval.evaluate("8 ^ 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives4For2Plus3Minus1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4";

        actual = eval.evaluate("2 + 3 - 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives11For6Plus3Into2DivideBy3() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "6";

        actual = eval.evaluate("6 + 3 * 2 / 3");

        Assert.assertEquals(expected, actual);
    }
}
