package eric.pham.SpringBMICalculator.services;

import eric.pham.SpringBMICalculator.dto.BMIDTO;

public class BMIService {
    public double calculateBMI(BMIDTO bmiDTO) {
        return bmiDTO.getWeight()/ Math.pow(bmiDTO.getHeight() / 100.0, 2);
    }
}
