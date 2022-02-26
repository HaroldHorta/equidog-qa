package com.company.storeapi.repositories.countinggeneral.facade;

import com.company.storeapi.model.entity.CountingGeneral;

import java.util.List;

public interface CountingGeneralRepositoryFacade {

    List<CountingGeneral> getAllCountingGeneral();
    CountingGeneral saveCountingGeneral(CountingGeneral countingGeneral);

    CountingGeneral validateCountingGeneral(String id);
}
