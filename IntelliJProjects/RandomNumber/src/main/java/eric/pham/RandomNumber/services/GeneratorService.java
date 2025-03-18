package eric.pham.RandomNumber.services;

import eric.pham.RandomNumber.dto.GeneratorDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GeneratorService {
    public int vygeneruj(GeneratorDTO generatorDTO) {
        Random random = new Random();
        return random.nextInt(generatorDTO.getCisloDo() - generatorDTO.getCisloOd() + 1) + generatorDTO.getCisloOd();
    }
}
