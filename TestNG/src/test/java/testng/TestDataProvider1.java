package testng;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDataProvider1 {

    @DataProvider(name = "testSum")
    public static Object[][] sumNumbers() {
        return new Object[][]{{new Math(1, 2), 3}, {new Math(2, 4), 6}, {new Math(18, 7), 25}};
    }

    @Test(dataProvider = "testSum")
    public void testSumNumbers(Math inputNumber, int expectedResult) {
        System.out.println(inputNumber.getA() + " + " + inputNumber.getB() + " = " + expectedResult);
        Assert.assertEquals(inputNumber.sum(), expectedResult);
    }

    @DataProvider(name = "testSubtract")
    public static Object[][] subtractNumbers() {
        return new Object[][]{{new Math(2, 1), 1}, {new Math(10, 3), 7}, {new Math(18, 7), 11}};
    }

    @Test(dataProvider = "testSubtract")
    public void testSubtractNumbers(Math inputNumber, int expectedResult) {
        System.out.println(inputNumber.getA() + " - " + inputNumber.getB() + " = " + expectedResult);
        Assert.assertEquals(inputNumber.subtract(), expectedResult);
    }

    @DataProvider(name = "testMultiply")
    public static Object[][] multiplyNumbers() {
        return new Object[][]{{new Math(2, 1), 2}, {new Math(10, 3), 30}, {new Math(18, 7), 126}};
    }

    @Test(dataProvider = "testMultiply")
    public void testMultiplyNumbers(Math inputNumber, int expectedResult) {
        System.out.println(inputNumber.getA() + " x " + inputNumber.getB() + " = " + expectedResult);
        Assert.assertEquals(inputNumber.multiply(), expectedResult);
    }

    @DataProvider(name = "testDivide")
    public static Object[][] divideNumbers() {
        return new Object[][]{{new Math(2, 1), 2}, {new Math(3, 2), 1}, {new Math(126, 19), 6}, {new Math(99, 9), 11}};
    }

    @Test(dataProvider = "testDivide")
    public void testDivideNumbers(Math inputNumber, int expectedResult) {
        System.out.println(inputNumber.getA() + " / " + inputNumber.getB() + " = " + expectedResult);
        Assert.assertEquals(inputNumber.divide(), expectedResult);
    }

}
