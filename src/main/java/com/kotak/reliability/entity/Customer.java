package com.kotak.reliability.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    private LocalDate creationDate;
    private LocalDate dob;
    private String crnLob;
    private String rm;
    private String branch;
    private String category;
    private String segment;
}
