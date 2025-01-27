package com.kotak.reliability.model;

import lombok.Data;

import java.util.List;

@Data
public class PageBlock {
    private String type;
    private String label;
    private List<PageBlock> values;
    private String jsonLocation;
    private Integer width;
    private Integer height;
    private String action;
    private String value;
    private String xKey;
    private String fill;
}
