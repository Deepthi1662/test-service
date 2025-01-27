package com.kotak.reliability.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CustomerResponse {

    private String customerId;
    private String customerName;
    private LocalDate creationDate;
    private LocalDate dob;
    private String crnLob;
    private String rm;
    private String branch;
    private String category;
    private String segment;
    private String averageMonthlyBalance;
    private String averageQuarterlyBalance;
}
