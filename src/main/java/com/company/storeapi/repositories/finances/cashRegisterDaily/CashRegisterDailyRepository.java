package com.company.storeapi.repositories.finances.cashregisterdaily;

import com.company.storeapi.model.entity.finance.CashRegisterDaily;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CashRegisterDailyRepository extends MongoRepository<CashRegisterDaily, String> {

    List<CashRegisterDaily> findAllByOrderByCreateAtDesc();

    CashRegisterDaily findAllByCashRegister(boolean cashRegister);

    boolean existsCashRegisterDailiesByCashRegister(boolean cash);

    List<CashRegisterDaily> findAllByOrderByIdDescPageable(boolean pag, Pageable pageable);

    int countByPageable(boolean pag);

}
