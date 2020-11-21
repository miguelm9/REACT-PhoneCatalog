package com.example.PhoneCatalog.backphonecatalog.service;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import org.springframework.stereotype.Service;

@Service
public class PhoneDetailService {
    public boolean isDetailingSuccessful (PhoneDTO phoneDTO) {

        return phoneDTO.getId() == 0;
    }
}
