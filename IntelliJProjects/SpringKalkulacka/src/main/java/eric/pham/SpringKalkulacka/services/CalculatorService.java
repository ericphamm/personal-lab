package eric.pham.SpringKalkulacka.services;

import eric.pham.SpringKalkulacka.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public float calculate(CalculatorDTO calculator) {
        switch (calculator.getOperation()) {
            case "+":
                return calculator.getFirstNumber() + calculator.getSecondNumber();
            case "-":
                return calculator.getFirstNumber() - calculator.getSecondNumber();
            case "/":
                if (calculator.getSecondNumber() == 0) {
                    throw new IllegalArgumentException("Cant divide by 0");
                }
                return calculator.getFirstNumber() / calculator.getSecondNumber();
            case "*":
                return calculator.getFirstNumber() * calculator.getSecondNumber();
            default:
                throw new IllegalArgumentException("Invalid operation" + calculator.getOperation());
        }
    }
}
