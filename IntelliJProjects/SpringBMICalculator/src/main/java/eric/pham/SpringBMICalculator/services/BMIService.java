package eric.pham.SpringBMICalculator.services;

import eric.pham.SpringBMICalculator.dto.BMIDTO;
import org.springframework.stereotype.Service;

@Service
public class BMIService {
    public double calculateBMI(BMIDTO bmiDTO) {
        double rawBMI = bmiDTO.getWeight()/ Math.pow(bmiDTO.getHeight() / 100.0, 2);
        return Math.round(rawBMI * 100.0) / 100.0;
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight!";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obesity Class I";
        } else if (bmi <40) {
            return "Obesity Class II";
        } else {
            return "Obesity Class III";
        }
    }
}
