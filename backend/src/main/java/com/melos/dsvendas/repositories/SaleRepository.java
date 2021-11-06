package com.melos.dsvendas.repositories;

import java.util.List;
import com.melos.dsvendas.entities.Sale;
import com.melos.dsvendas.dto.SaleSuccessDTO;
import com.melos.dsvendas.dto.SaleSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long>{

    @Query("SELECT new com.melos.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale As obj GROUP BY"
    +" obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.melos.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
    + " FROM Sale obj GROUP BY obj.seller")
    List<SaleSuccessDTO> saleSuccess();
}
