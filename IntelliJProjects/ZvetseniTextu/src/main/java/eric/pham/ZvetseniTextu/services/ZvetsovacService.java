package eric.pham.ZvetseniTextu.services;

import eric.pham.ZvetseniTextu.dto.ZvetsovacDTO;
import org.springframework.stereotype.Service;

@Service
public class ZvetsovacService {
    public String zvetsi(ZvetsovacDTO zvetsovacDTO) {
        return zvetsovacDTO.getText().toUpperCase();
    }

    public String zmensi(ZvetsovacDTO zvetsovacDTO) {
        return zvetsovacDTO.getText().toLowerCase();
    }
}
