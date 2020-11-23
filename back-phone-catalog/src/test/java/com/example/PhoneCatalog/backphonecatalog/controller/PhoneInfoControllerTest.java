package com.example.PhoneCatalog.backphonecatalog.controller;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.service.PhoneDetailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class PhoneInfoControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private PhoneDetailService phoneDetailService;

    @Test
    public void givenPhoneDTO_whenIDvalid_thenReturn200OK () throws Exception {
        //Given
        PhoneDTO phoneDTO = new PhoneDTO(0, "iPhone7", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);

        when(phoneDetailService.isDetailingSuccessful(phoneDTO)).thenReturn(true);

        //When
        mvc.perform(MockMvcRequestBuilders.post("/test")
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(phoneDTO)))
                // Then
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void givenPhoneDTO_whenIDinvalid_thenReturn401K () throws Exception {
        //Given
        PhoneDTO phoneDTO = new PhoneDTO(0, "iPhone7", "manufactorar", "description", "color", 200.50, "file.png", "screen", "processor", 3);
        //When
        mvc.perform(MockMvcRequestBuilders.post("/test")
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(phoneDTO)))
                // Then
                .andExpect(status().is(401))
                .andReturn();
        verify(phoneDetailService).isDetailingSuccessful(phoneDTO);
    }
}