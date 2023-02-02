package com.adryan.springbrewery.service;

import com.adryan.springbrewery.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Vodoo")
                .beerStyle("Pale Ale")
                .build();
    }
}
