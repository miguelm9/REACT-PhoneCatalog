package com.example.PhoneCatalog.backphonecatalog.controller;

import com.example.PhoneCatalog.backphonecatalog.model.IdDTO;
import com.example.PhoneCatalog.backphonecatalog.model.PhoneDTO;
import com.example.PhoneCatalog.backphonecatalog.service.PhoneDetailService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PhoneCatalog.backphonecatalog.utils.PhoneListCreator;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PhoneInfoController {

    PhoneDetailService phoneDetailService;

    @GetMapping("/phones")
    public ResponseEntity<List<PhoneDTO>> listPhones () {
        return ResponseEntity.status(HttpStatus.OK).body(new PhoneListCreator().createListWithPhones());
    }

    @PostMapping("/details")
    public ResponseEntity<PhoneDTO> getDetails (@RequestBody IdDTO idDTO) {
        return (phoneDetailService.isDetailingSuccessful(idDTO) == null)
                ? ResponseEntity.status(401).body(null)
                : ResponseEntity.ok(phoneDetailService.isDetailingSuccessful(idDTO));
    }
}
