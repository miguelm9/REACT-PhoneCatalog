package com.example.PhoneCatalog.backphonecatalog.service;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PhoneDetailServiceTest {
    @InjectMocks
    private PhoneDetailService phoneDetailService;

    @Test
    public void givenPhoneDTO_whenIDinvalid_returnFalse () {
        //Given
        PhoneDTO phoneDTO = new PhoneDTO(0, "iPhone7", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        //When
        boolean actualResponse = phoneDetailService.isDetailingSuccessful(phoneDTO);
        //Then
        assertFalse(actualResponse);
    }
}