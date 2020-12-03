package com.example.PhoneCatalog.backphonecatalog.controller;

import com.example.PhoneCatalog.backphonecatalog.model.IdDTO;
import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.service.PhoneDetailService;
import com.example.PhoneCatalog.backphonecatalog.utils.PhoneListCreator;
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

import java.util.List;

import static org.mockito.Mockito.*;
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
        IdDTO idDTO = new IdDTO(0);
        //When
        mvc.perform(MockMvcRequestBuilders.post("/details")
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(idDTO)))
                // Then
                .andExpect(status().is(200))
                .andReturn();
        verify(phoneDetailService, atLeast(2)).isDetailingSuccessful(idDTO);
    }

    @Test
    public void givenPhoneDTO_whenIDinvalid_thenReturn401K () throws Exception {
        //Given
        IdDTO idDTO = new IdDTO(-1);
        //When
        mvc.perform(MockMvcRequestBuilders.post("/details")
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(idDTO)))
                // Then
                .andExpect(status().is(200))
                .andReturn();
        verify(phoneDetailService, atLeast(2)).isDetailingSuccessful(idDTO);
    }
}