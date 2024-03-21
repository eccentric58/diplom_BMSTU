package com.example.medicine.fwd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Patient {

    private final String name;
    private final int age;
    private final String sex;
    private final String insurance;


}
