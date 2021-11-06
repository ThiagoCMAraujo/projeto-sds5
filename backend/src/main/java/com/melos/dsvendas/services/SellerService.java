package com.melos.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.melos.dsvendas.dto.SellerDTO;
import com.melos.dsvendas.entities.Seller;
import com.melos.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    // SellerDTO para a classe de serviço n interagir diretamente com as entidades
    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        // Converte Seller para SellerDTO
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
