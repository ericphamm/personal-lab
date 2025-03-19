package eric.pham.Statistika.services;

import eric.pham.Statistika.dto.StatistikaDTO;
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

    public int spocitejSoucet (StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);
        return cisla.stream().mapToInt(Integer::intValue).sum();
    }

    public int spocitejNejmensi (StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);
        return cisla.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public int spocitejNejvetsi(StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);
        return cisla.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public float spocitejPrumer(StatistikaDTO statistikaDTO) {
        List<Integer> cisla = convertToList(statistikaDTO);
        return (float) cisla.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
