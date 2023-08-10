package com.example.rbmqProducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vm implements Serializable {

    private Long id;
    private String name;
    private Integer ram;
    private Integer storage;
}
