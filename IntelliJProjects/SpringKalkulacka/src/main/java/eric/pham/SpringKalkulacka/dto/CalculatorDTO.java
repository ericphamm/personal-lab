package eric.pham.SpringKalkulacka.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CalculatorDTO {
    @NotNull(message = "Zadejte prvni cislo")
    private Float firstNumber;

    @NotNull(message = "Zadejte druhe cislo")
    private Float secondNumber;

    @NotEmpty(message = "Vyberte operaci")
    private String operation;

    public Float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
