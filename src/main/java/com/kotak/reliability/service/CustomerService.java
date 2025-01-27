package com.kotak.reliability.service;

import com.kotak.reliability.model.CustomerResponse;

public interface CustomerService {

    public CustomerResponse getCustomerResponse(String customerId);
}
