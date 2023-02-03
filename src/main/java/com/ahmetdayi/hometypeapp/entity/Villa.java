package com.ahmetdayi.hometypeapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor

//persistence
@Entity
public class Villa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Min(1)
    private double price;

    @NotNull
    @Min(1)
    private double villaSize;

    @NotNull
    private int roomCount;
    @NotNull
    private int livingRoomCount;
}
