package proskyjavacourse2.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proskyjavacourse2.calculator.service.Impl.CalculatorServiceImpl;

public class CalculatorServiceImplTest {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    private int num1;
    private int num2;
    private int num3;

    @BeforeEach
    public void setNums() {
        num1 = 4;
        num2 = 5;
        num3 = 0;
    }

    @Test
    public void sum() {
    Assertions.assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @Test
    public void minus(){
        Assertions.assertEquals(num1 - num2, out.subtract(num1,num2));
    }

    @Test
    public void multiply() {
        Assertions.assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @Test
    public void divide (){
        Assertions.assertEquals(num1 / num2, out.divide(num1,num2));
    }
    @Test
    public void throwingIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(num1, num3));
    }




}
