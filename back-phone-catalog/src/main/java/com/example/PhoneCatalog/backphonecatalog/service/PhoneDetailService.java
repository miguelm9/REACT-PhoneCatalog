package com.example.PhoneCatalog.backphonecatalog.service;
import java.util.List;

import com.example.PhoneCatalog.backphonecatalog.model.IdDTO;
import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.utils.PhoneListCreator;
import org.springframework.stereotype.Service;

@Service
public class PhoneDetailService {
    public List<PhoneDTO> isDetailingSuccessful (IdDTO idDTO) {
        PhoneListCreator phoneListCreator = new PhoneListCreator();
        List<PhoneDTO> phoneDTOList = phoneListCreator.createListWithPhones();
        if (idDTO.getId() < 0 || idDTO.getId() > phoneDTOList.size())
            return null;
        return List.of(phoneDTOList.get(idDTO.getId()));
    }
}
