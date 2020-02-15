import Lesson_6.Calculator;
import org.junit.*;

public class TestCalc {

    Calculator calculator;

    @Before
    public void init() {
        System.out.println("new");
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {
        Assert.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testAdd2() {
        Assert.assertEquals(5, calculator.add(3,2));
    }

    @Test
    public void testAdd3() {
        Assert.assertEquals(10, calculator.add(5,5));
    }

    @Test(expected = ArithmeticException.class, timeout = 10000)
   // @Ignore(value = "тест точно работает правильно 13022020")
    public void testDiv1() {
        Assert.assertEquals(2, calculator.div(10,5));
    }


    @After
    public void shutdown() {
        System.out.println("end!");
    }
}
