package com.melos.dsvendas.services;

import java.util.List;
import com.melos.dsvendas.dto.SaleDTO;
import com.melos.dsvendas.dto.SaleSuccessDTO;
import com.melos.dsvendas.dto.SaleSumDTO;
import com.melos.dsvendas.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import com.melos.dsvendas.repositories.SaleRepository;
import com.melos.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    // SellerDTO para a classe de serviço n interagir diretamente com as entidades
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        // Converte Seller para SellerDTO
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> saleSuccess() {
        return repository.saleSuccess();
    }


}
