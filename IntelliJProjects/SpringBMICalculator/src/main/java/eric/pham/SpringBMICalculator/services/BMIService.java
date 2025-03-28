package eric.pham.SpringBMICalculator.services;

import eric.pham.SpringBMICalculator.dto.BMIDTO;
import org.springframework.stereotype.Service;

@Service
public class BMIService {

   public double calculate(BMIDTO bmidto) {
       return bmidto.getWeight() / Math.pow((bmidto.getHeight() / 100.0), 2);
   }
}
