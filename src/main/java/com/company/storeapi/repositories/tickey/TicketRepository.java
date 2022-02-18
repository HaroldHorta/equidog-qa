package com.company.storeapi.repositories.tickey;

import com.company.storeapi.model.entity.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TicketRepository extends MongoRepository<Ticket, String> {

    List<Ticket> findAllByOrderByCreateAtDesc();
    List<Ticket> findTicketByCustomer_NroDocument(String nroDocument);


}
