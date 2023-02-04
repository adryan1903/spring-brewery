package com.adryan.springbrewery.service;

import com.adryan.springbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID CustomerId);

}
