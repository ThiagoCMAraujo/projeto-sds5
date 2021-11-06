package com.melos.dsvendas.controllers;

import com.melos.dsvendas.dto.SaleDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import com.melos.dsvendas.services.SaleService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;


// Postman Url+?sort = field name
    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    
}
