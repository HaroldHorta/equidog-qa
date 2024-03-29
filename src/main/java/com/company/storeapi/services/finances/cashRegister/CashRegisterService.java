package com.company.storeapi.services.finances.cashregister;

import com.company.storeapi.model.payload.response.finance.ResponseCashRegisterDTO;
import com.company.storeapi.model.payload.response.finance.ResponseListCashRegisterDailyPaginationDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Pageable;

public interface CashRegisterService {

    ResponseCashRegisterDTO saveCashRegister ();

    ResponseListCashRegisterDailyPaginationDto getCashRegisterPageable() throws JsonProcessingException;

    ResponseListCashRegisterDailyPaginationDto getCashRegisterPageable(Pageable pageable);
}
