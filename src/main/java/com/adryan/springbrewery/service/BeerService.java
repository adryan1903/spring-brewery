package com.adryan.springbrewery.service;

import com.adryan.springbrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
