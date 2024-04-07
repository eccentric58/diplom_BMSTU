package com.example.medicine.fwd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
public class Patient {

    private final String name;
    private final int age;
    private final String sex;
    private final String insurance;

   // ArrayList<String> report = new ArrayList<>();


}
