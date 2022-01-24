package proskyjavacourse2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import proskyjavacourse2.calculator.service.Impl.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    public static Stream<Arguments> provideParamsForSumTest(){
        return Stream.of(
                Arguments.of(1, 3, 4),
                Arguments.of(2, 5, 7),
                Arguments.of(4,3,7));
    }

    public static Stream<Arguments> provideParamsForSubtractTest(){
        return Stream.of(
                Arguments.of(5,4,1),
                Arguments.of(3,2,1),
                Arguments.of(10, 0, 10));
    }

    public static Stream<Arguments> provideParamsForMultiplyTest(){
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(3,3,9),
                Arguments.of(0,0,0));
    }

    public static Stream<Arguments> provideParamsForDivideTest(){
        return Stream.of(
                Arguments.of(9,3,3),
                Arguments.of(12,4,3),
                Arguments.of(15,5,3));
    }

    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForSumTest")
    public void sumTest (int num1, int num2, int result){
        int expected = out.sum(num1, num2);
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractTest")
    public void subtractTest (int num1, int num2, int result){
        int expected = out.subtract(num1, num2);
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void multiplyTest (int num1, int num2, int result){
        int expected = out.multiply(num1, num2);
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divideTest (int num1, int num2, int result){
        int expected = out.divide(num1, num2);
        Assertions.assertEquals(result, expected);
    }


}
