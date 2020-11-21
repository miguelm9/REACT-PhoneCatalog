package com.example.PhoneCatalog.backphonecatalog.controller;

import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.service.PhoneDetailService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utils.PhoneListCreator;

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
    public ResponseEntity<List<PhoneDTO>> listPhones () {
        return ResponseEntity.status(HttpStatus.OK).body(new PhoneListCreator().fillListWithPhones());
    }
}
