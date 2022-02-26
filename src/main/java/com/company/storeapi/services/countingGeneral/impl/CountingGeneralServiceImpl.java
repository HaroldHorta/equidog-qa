package com.company.storeapi.services.countingGeneral.impl;

import com.company.storeapi.model.entity.CountingGeneral;
import com.company.storeapi.model.entity.Order;
import com.company.storeapi.model.enums.OrderStatus;
import com.company.storeapi.repositories.countinggeneral.facade.CountingGeneralRepositoryFacade;
import com.company.storeapi.repositories.order.facade.OrderRepositoryFacade;
import com.company.storeapi.services.countingGeneral.CountingGeneralService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountingGeneralServiceImpl implements CountingGeneralService {

    private final CountingGeneralRepositoryFacade countingGeneralRepositoryFacade;
    private final OrderRepositoryFacade orderRepository;

    public CountingGeneralServiceImpl(CountingGeneralRepositoryFacade countingGeneralRepositoryFacade, OrderRepositoryFacade orderRepository) {
        this.countingGeneralRepositoryFacade = countingGeneralRepositoryFacade;
        this.orderRepository = orderRepository;
    }

    @Override
    public List<CountingGeneral> getAllCountingGeneral() {
        return countingGeneralRepositoryFacade.getAllCountingGeneral();
    }

    @Override
    public CountingGeneral saveCountingGeneral(CountingGeneral countingGeneral) {
        return countingGeneralRepositoryFacade.saveCountingGeneral(countingGeneral);
    }

    @Override
    public void counting (String idOrder, OrderStatus orderStatus){
        Order order = orderRepository.validateAndGetOrderById(idOrder);

        List<CountingGeneral> counting = countingGeneralRepositoryFacade.getAllCountingGeneral();

        counting.forEach(p->{
            CountingGeneral countingGeneral = countingGeneralRepositoryFacade.validateCountingGeneral(p.getId());

            if(order.getOrderStatus()== OrderStatus.ABIERTA){
                countingGeneral.setQuantityOfOrdersInOpenState(countingGeneral.getQuantityOfOrdersInOpenState()-1);
                if(orderStatus == OrderStatus.PAGADA){
                    countingGeneral.setQuantityOfOrdersInPayedState(countingGeneral.getQuantityOfOrdersInPayedState()+1);
                }if(orderStatus == OrderStatus.CANCELADA){
                    countingGeneral.setQuantityOfOrdersInCancelledState(countingGeneral.getQuantityOfOrdersInCancelledState()+1);
                }
            }

            if(order.getOrderStatus()== OrderStatus.CANCELADA){
                countingGeneral.setQuantityOfOrdersInCancelledState(countingGeneral.getQuantityOfOrdersInCancelledState()-1);
                if(orderStatus == OrderStatus.ABIERTA){
                    countingGeneral.setQuantityOfOrdersInOpenState(countingGeneral.getQuantityOfOrdersInOpenState()+1);
                }
            }

            countingGeneralRepositoryFacade.saveCountingGeneral(countingGeneral);
        });




    }

    @Override
    public CountingGeneral validateCountingGeneral(String id) {
        return countingGeneralRepositoryFacade.validateCountingGeneral(id);
    }
}
