package com.xworkz.telescope.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class TelescopeDto {
    private String date;
    private int count;
    private boolean soapUsed;
    private String location;
    private int duration;
    private String remarks;
}