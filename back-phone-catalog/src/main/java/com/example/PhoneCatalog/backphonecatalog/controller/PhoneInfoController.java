package com.example.PhoneCatalog.backphonecatalog.controller;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.service.PhoneDetailService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PhoneInfoController {

    PhoneDetailService phoneDetailService;
    ObjectMapper objectMapper;

    @PostMapping("/test")
    public ResponseEntity<String> getPhonesInfo (@RequestBody PhoneDTO phoneDTO) {
        return phoneDetailService.isDetailingSuccessful(phoneDTO) ?
                ResponseEntity.status(200).build()
                : ResponseEntity.status(401).body("Hello");
    }

    @GetMapping("/phones")
    public ResponseEntity<List<PhoneDTO>> hello() {
        PhoneDTO phoneDTO = new PhoneDTO(0, "Miguel");
        PhoneDTO phoneDTO1 = new PhoneDTO(1, "Miguel1");
        PhoneDTO phoneDTO2 = new PhoneDTO(2, "Miguel1");
        List<PhoneDTO> phoneList = List.of(phoneDTO, phoneDTO1, phoneDTO2);
        JSONObject jsonModel = new JSONObject();
        jsonModel.put("name","mickey");
        return ResponseEntity.status(HttpStatus.OK).body(phoneList);
    }
}
