package utils;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;

import java.util.List;

public class PhoneListCreator {

    public List<PhoneDTO> fillListWithPhones () {
        PhoneDTO phoneDTO = new PhoneDTO(0, "iPhone7", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        PhoneDTO phoneDTO1 = new PhoneDTO(0, "Meizu M5", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        PhoneDTO phoneDTO2 = new PhoneDTO(0, "Samsun Galaxy S5", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        PhoneDTO phoneDTO3 = new PhoneDTO(0, "Xiamo Light 3", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        PhoneDTO phoneDTO4 = new PhoneDTO(0, "Glock", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);

        return List.of(phoneDTO, phoneDTO1, phoneDTO2,phoneDTO4, phoneDTO3);
    }
}
