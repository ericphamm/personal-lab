package eric.pham.SpringBMICalculator.services;

import eric.pham.SpringBMICalculator.dto.BMIDTO;
import org.springframework.stereotype.Service;

@Service
public class BMIService {
    public double calculateBMI(BMIDTO bmiDTO) {
        return bmiDTO.getWeight()/ Math.pow(bmiDTO.getHeight() / 100.0, 2);
    }
}
