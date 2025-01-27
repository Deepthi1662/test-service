package com.kotak.reliability.service;


import com.kotak.reliability.entity.Customer;
import com.kotak.reliability.model.CustomerResponse;
import com.kotak.reliability.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerResponse getCustomerResponse(String customerId) {
        Optional<Customer> customerDataOptional = customerRepository.findById(customerId);
        if (customerDataOptional.isPresent()) {
            Customer customer = customerDataOptional.get();
            return CustomerResponse.builder()
                    .customerId(customer.getCustomerId())
                    .customerName(customer.getCustomerName())
                    .creationDate(customer.getCreationDate())
                    .dob(customer.getDob())
                    .crnLob(customer.getCrnLob())
                    .rm(customer.getRm())
                    .branch(customer.getBranch())
                    .category(customer.getCategory())
                    .segment(customer.getSegment())
                    .build();
        }
        return CustomerResponse.builder().build();
    }
}
