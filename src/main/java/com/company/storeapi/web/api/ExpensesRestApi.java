package com.company.storeapi.web.api;

import com.company.storeapi.core.exceptions.base.ServiceException;
import com.company.storeapi.model.payload.request.finance.RequestAddExpensesDTO;
import com.company.storeapi.model.payload.response.category.ResponseListCategoryPaginationDto;
import com.company.storeapi.model.payload.response.finance.ResponseExpensesDTO;
import com.company.storeapi.model.payload.response.finance.ResponseListExpensesPaginationDto;
import com.company.storeapi.services.finances.expenses.ExpensesService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/expenses")
@CrossOrigin({"*"})
public class ExpensesRestApi {

    @Value("${spring.size.pagination}")
    private int size;

    private final ExpensesService expensesService;

    public ExpensesRestApi(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @GetMapping(value = "/expensesFilter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseListExpensesPaginationDto getAllExpensesFilter() {
        return expensesService.getExpensesPageable();
    }


    @GetMapping(value = "/page", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseListExpensesPaginationDto getAllExpensesPage(@Param(value = "page") int page) {
        Pageable requestedPage = PageRequest.of(page, size);
        return expensesService.getExpensesPageable(requestedPage);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseExpensesDTO> findExpensesById(@PathVariable("id") String  id)
    {
        ResponseExpensesDTO entity = expensesService.findExpensesById(id);
        return new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseExpensesDTO> saveExpenses (@RequestBody RequestAddExpensesDTO requestAddExpensesDTO) throws ServiceException{
        ResponseExpensesDTO newExpenses = expensesService.saveExpenses(requestAddExpensesDTO);
        return new ResponseEntity<>(newExpenses, new HttpHeaders(), HttpStatus.CREATED);
    }


}
