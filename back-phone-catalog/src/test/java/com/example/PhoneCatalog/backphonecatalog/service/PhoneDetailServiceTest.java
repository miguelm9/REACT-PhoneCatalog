package com.example.PhoneCatalog.backphonecatalog.service;

import com.example.PhoneCatalog.backphonecatalog.model.IdDTO;
import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.utils.PhoneListCreator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class PhoneDetailServiceTest {
    @InjectMocks
    private PhoneDetailService phoneDetailService;

    @Test
    public void givenPhoneDTO_whenIDvalid_returnTrue () {
        //Given
        PhoneListCreator phoneListCreator = new PhoneListCreator();
        List<PhoneDTO> phoneDTOList = phoneListCreator.createListWithPhones();
        IdDTO idDTO = new IdDTO(1);
        //When
        List<PhoneDTO> actualResponse = phoneDetailService.isDetailingSuccessful(idDTO);
        //Then
        System.out.println("This is the new shit: "+ actualResponse);
        System.out.println("This is the old shit: "+ phoneDTOList.get(idDTO.getId()));
        assertSame(actualResponse, phoneDTOList.get(idDTO.getId()));
    }
}