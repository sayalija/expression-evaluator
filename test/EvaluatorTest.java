import junit.framework.Assert;
import org.junit.Test;
import sayalija.Evaluator;

public class EvaluatorTest {
    @Test
    public void testGives5WhenExpressionIsAdditionOf2And3() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
            String expected = "5.0";

        actual = eval.evaluate("2 + 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives5WhenExpressionIsAdditionOf2And2And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "5.0";

        actual = eval.evaluate("2 + 2 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives7ForAdditionOf2And4And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "7.0";

        actual = eval.evaluate("2 + 4 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives14ForAdditionOf10And2And1And1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "14.0";

        actual = eval.evaluate("10 + 2 + 1 + 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForSubtractionOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4.0";

        actual = eval.evaluate("6 - 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForMultiplicationOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "24.0";

        actual = eval.evaluate("3 * 8");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForDivisionOfTwoNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4.0";

        actual = eval.evaluate("12 / 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives64For8PowerOf2() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "64.0";

        actual = eval.evaluate("8 ^ 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives4For2Plus3Minus1() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "4.0";

        actual = eval.evaluate("2 + 3 - 1");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives11For16Plus3DivideBy2() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "9.5";

        actual = eval.evaluate("16 + 3 / 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGives2500For3Into12Minus20Plus34PowerOf2() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "1296.0";

        actual = eval.evaluate("3 * 12 ^ 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesExpressionBackWhenItHasOnlyOneOperand() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "12";

        actual = eval.evaluate("12");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForAPairOfBracketsInEnding() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "11.0";

        actual = eval.evaluate("2 + ( 3 * 3 )");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForAPairOfBracketsInStrting() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "15.0";

        actual = eval.evaluate("( 2 + 3 ) * 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForAPairOfBrackets() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "12.0";

        actual = eval.evaluate("20 / ( 2 + 3 ) * 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForAPairOfBracketsWithPowerOfOperator() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "7.5";

        actual = eval.evaluate("20 / ( 2 ^ 3 ) * 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForAPairOfBracketsWithPowerOfOperatorAndNegativeNumbers() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "-7.5";

        actual = eval.evaluate("-20 / ( 2 ^ 3 ) * 3");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForExpressionWithNestedBracketsAtLast() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "6.0";

        actual = eval.evaluate("36 / ( 2 + ( 3 + 1 ) )");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForExpressionWithNestedBrackets() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "12.0";

        actual = eval.evaluate("36 / ( 2 + ( 3 * 1 ) - 2 )");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForExpressionWhenOperandsPresentAfterLastBracket() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "144.0";

        actual = eval.evaluate("36 / ( 2 + ( 3 * 1 ) - 2 ) ^ 2");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGettingAnswerForExpressionWithMultiplePairsOfBrackets() throws Exception {
        Evaluator eval = new Evaluator();
        String actual;
        String expected = "13.0";

        actual = eval.evaluate("36 / ( 2 + ( 3 * 1 ) - 2 ) + ( 1 ^ 2 )");

        Assert.assertEquals(expected, actual);
    }

}