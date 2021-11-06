package com.melos.dsvendas.controllers;

import java.util.List;
import com.melos.dsvendas.dto.SaleDTO;
import com.melos.dsvendas.dto.SaleSuccessDTO;
import com.melos.dsvendas.dto.SaleSumDTO;
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

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
        List<SaleSumDTO> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sale-success")
    public ResponseEntity<List<SaleSuccessDTO>> saleSuccess(){
        List<SaleSuccessDTO> list = service.saleSuccess();
        return ResponseEntity.ok(list);
    }



    
}
