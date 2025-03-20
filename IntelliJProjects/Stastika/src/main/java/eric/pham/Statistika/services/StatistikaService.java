package eric.pham.Statistika.services;

import eric.pham.Statistika.dto.StatistikaDTO;
import eric.pham.Statistika.dto.StatistikaResultDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class StatistikaService {
    public List<Integer> convertToList(StatistikaDTO statistikaDTO) {
        return Arrays.stream(statistikaDTO.getInput().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public StatistikaResultDTO vygenerujStatistiku(StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);

        int soucet = cisla.stream().mapToInt(Integer::intValue).sum();
        int nejmensi = cisla.stream().mapToInt(Integer::intValue).min().orElse(0);
        int nejvetsi = cisla.stream().mapToInt(Integer::intValue).max().orElse(0);
        float prumer = (float)cisla.stream().mapToInt(Integer::intValue).average().orElse(0);

        return new StatistikaResultDTO(soucet, nejmensi, nejvetsi, prumer);
    }

}
