package eric.pham.Statistika.services;

import eric.pham.Statistika.dto.StatistikaDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatistikaService {
    public List<Integer> convertToList(StatistikaDTO statistikaDTO) {
        return Arrays.stream(statistikaDTO.getInput().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int spocitejSoucet (StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);
        return cisla.stream().mapToInt(Integer::intValue).sum();
    }

}
