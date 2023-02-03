package com.ahmetdayi.hometypeapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class BaseHome {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Min(1)
    @NotNull
    private double price;

    @Min(1)
    @NotNull
    private double houseSize;

    @NotNull
    private int roomCount;

    @NotNull
    private int livingRoomCount;

    public BaseHome(double price, double houseSize, int roomCount, int livingRoomCount) {
        this.price = price;
        this.houseSize = houseSize;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }
}
