package com.company.storeapi.web.api;

import com.company.storeapi.model.payload.request.company.RequestAddCompanyDTO;
import com.company.storeapi.model.payload.response.company.ResponseCompanyDTO;
import com.company.storeapi.services.company.CompanyService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Company rest api.
 */
@RestController
@RequestMapping(value = "/api/company")
@CrossOrigin({"*"})
public class CompanyRestApi {
    

    private final CompanyService service;

    /**
     * Instantiates a new Company rest api.
     *
     * @param service the service
     */
    public CompanyRestApi(CompanyService service) {
        this.service = service;
    }
    

    /**
     * Gets all company.
     *
     * @return the all company
     * @ the service exception
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ResponseCompanyDTO> getAll()  {
        return service.getAllCompany();
    }

    /**
     * Gets company by id.
     *
     * @param id the id
     * @return the company by id
     * @ the service exception
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCompanyDTO> getById(@PathVariable("id") String id)
             {
                 ResponseCompanyDTO entity = service.validateAndGetCompanyById(id);
        return new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    /**
     * Create response entity.
     *
     * @param requestAddCompanyDTO the request add company dto
     * @return the response entity
     * @ the service exception
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseCompanyDTO> create(@RequestBody RequestAddCompanyDTO requestAddCompanyDTO)  {
        ResponseCompanyDTO created = service.save(requestAddCompanyDTO);
        return new ResponseEntity<>(created, new HttpHeaders(), HttpStatus.CREATED);
    }


}
