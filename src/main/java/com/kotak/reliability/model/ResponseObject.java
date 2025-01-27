package com.kotak.reliability.model;

import lombok.Data;

import java.util.List;

@Data
public class ResponseObject {
    private String type;
    private String label;
    private String action;
    private String value;
    private String xKey;
    private String fill;
    private Integer width;
    private Integer height;
    private List<ResponseObject> values;
}
