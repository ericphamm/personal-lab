package cz.itnetwork.spring.models;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public float calculate(CalculatorDTO calculator) {
        if (calculator.getOperation().equals("+")) {
            return calculator.getNumber1() + calculator.getNumber2();
        } else if (calculator.getOperation().equals("-")) {
            return calculator.getNumber1() - calculator.getNumber2();
        } else if (calculator.getOperation().equals("*")) {
            return calculator.getNumber1() * calculator.getNumber2();
        } else {
            if (calculator.getNumber2() == 0) {
                throw new IllegalArgumentException("Druhe cislo nemuze byt 0");
            }
            return calculator.getNumber1() / calculator.getNumber2();
        }
    }
}
