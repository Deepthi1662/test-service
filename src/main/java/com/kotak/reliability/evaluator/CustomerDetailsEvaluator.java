package com.kotak.reliability.evaluator;

import com.kotak.reliability.model.CustomerResponse;
import com.kotak.reliability.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerDetailsEvaluator {
    @Autowired
    private CustomerService customerService;

    public Map<String, String> evaluate() {
        CustomerResponse customerResponse =
                customerService.getCustomerResponse("CRN0012937");

        Map<String, String> customerData = new HashMap<>();
        customerData.put("customerId", customerResponse.getCustomerId());
        customerData.put("customerName", customerResponse.getCustomerName());
        customerData.put("creationDate", customerResponse.getCreationDate().toString());
        customerData.put("dob", customerResponse.getDob().toString());

        return customerData;
    }
}
