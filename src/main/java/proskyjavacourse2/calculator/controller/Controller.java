package proskyjavacourse2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyjavacourse2.calculator.service.CalculatorService;

@RestController
@RequestMapping ("/calculator")
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sum(num1, num2);
        return num1 + "+ " + num2 + " =" + result;

    }

    @GetMapping("/minus")
    public String subtract(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.subtract(num1, num2);
        return num1 + "-" + num2 + "=" + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + result;
    }
}






